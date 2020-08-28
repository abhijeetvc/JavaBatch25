import java.sql.*;
import java.util.Scanner;

public class JdbcConnect {

    Connection con;  //interface
    Statement stmt;  //interface
    PreparedStatement pst;
    ResultSet rs;
    Scanner sc=new Scanner(System.in);

    public JdbcConnect() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        // URL, Username, password
        con= DriverManager.getConnection("jdbc:mysql://localhost:3306/shridb",
                "root","jesus");
        stmt=con.createStatement();
    }

    void getData() throws SQLException {
        rs=stmt.executeQuery("select * from employee");

        while(rs.next()){
            System.out.println("Id : "+rs.getInt(1));
            System.out.println("Name : "+rs.getString(2));
            System.out.println("City : "+rs.getString(3));
            System.out.println("Salary : "+rs.getInt(4));
            System.out.println();
        }
    }

//    void insertData() throws SQLException {
//        stmt.execute("insert into employee values(4,'D','Bangalore',75000)");
//        System.out.println("Data Inserted successfully");
//    }

    void insertData() throws SQLException {

        System.out.println("Enter id: ");
        int id=sc.nextInt();
        System.out.println("Enter name: ");
        String name=sc.next();
        System.out.println("Enter city: ");
        String city=sc.next();
        System.out.println("Enter Salary: ");
        int salary=sc.nextInt();

        pst=con.prepareStatement("insert into employee values(?,?,?,?)");
        pst.setInt(1,id);
        pst.setString(2,name);
        pst.setString(3,city);
        pst.setInt(4,salary);
        pst.execute();
        System.out.println("Data Inserted successfully");
    }

    void updateData() throws SQLException {
        stmt.execute("update employee set salary=90000 where id=4");
        System.out.println("Data updated successfully");
    }

    void deleteData() throws SQLException {
        System.out.println("Enter id for employee: ");
        int id=sc.nextInt();
       // stmt.execute("delete from employee where id=3");
        pst=con.prepareStatement("delete from employee where id=?");
        pst.setInt(1,id);
        pst.execute();
        System.out.println("Data deleted successfully");
    }
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        JdbcConnect jc=new JdbcConnect();
       // jc.insertData();
         jc.deleteData();
        jc.getData();
      //  jc.updateData();
    }
}
