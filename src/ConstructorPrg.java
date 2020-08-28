import java.util.Scanner;

public class ConstructorPrg {

    int a,b;   //Instance variables
    public ConstructorPrg(int a,int b){    //default or no-argument constructor
        this.a=a;   // 'this' is keyword in java. It refers to current object.
        this.b=b;
      //  System.out.println("hiiiiii");
    }

    void add(){
        System.out.println("Addition is: "+(a+b));
    }

    void sub(){
        System.out.println("Subtraction is: "+(a-b));
    }

    void multiply(){
        System.out.println("Multiplication is: "+(a*b));
    }

    void divide(){
        System.out.println("Division is: "+(a/b));
    }

    void display(){
        System.out.println(a);
    }

    public static void main(String[] args) {
        ConstructorPrg c=new ConstructorPrg(10,5);
        c.display();
        c.add();
        c.sub();
        c.multiply();
        c.divide();
    }
}
