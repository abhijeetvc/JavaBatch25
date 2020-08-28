// Variable Types: a) Instance Variables, b) Local Variables, c) Class/static variables, d) Parameters

import java.util.Scanner;

public class HelloWorld {

    int x=20;  // Instance variable
    static int y=30;  //Static/class variable
    public static void main(String[] args) {
        int a=10;  // variable: Storage area in memory. 'a' is variable. Local Variable
        System.out.println("Hello Java ");
        System.out.println("Value of a: "+a);

        HelloWorld h=new HelloWorld();
        System.out.println("Value of x: "+h.x);

        // Scanner - It is a final class
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of x1: ");
        int x1=sc.nextInt();
        System.out.println("Enter value for y1: ");
        int y1=sc.nextInt();
        int result=x1+y1;
        System.out.println("Addition is: "+result);
    }
}
