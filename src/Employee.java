//Encapsulation: One of the key features of object oriented programming
// It is used for bundling of fields and methods inside a single class

public class Employee {

    private int id;
    private String name;
    private String city;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

class CheckEncap{

    Employee getData(){
        Employee e=new Employee();
        e.setId(1);
        e.setName("A");
        e.setCity("Pune");
        return e;
    }
}

class CheckMain{
    public static void main(String[] args) {
        CheckEncap c=new CheckEncap();
        Employee emp=c.getData();
        System.out.println("Id: "+emp.getId());
        System.out.println("Name: "+emp.getName());
        System.out.println("City: "+emp.getCity());
    }
}

// Java, Spring, MySQL, MongoDB, HTML, CSS, Bootstrap, Javascript, ReactJS, AWS deployment,
// Microservices