import java.util.Scanner;

public class DoWhilePrg {

    public static void main(String[] args) {

        double number, total=0.0;
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter number: ");
            number=sc.nextInt();
            total+=number;   //total=total+number;
        }while(number!=0.0);
        System.out.println("Total is: "+total);
    }
}
