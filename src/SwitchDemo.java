import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter no1");
        int a=sc.nextInt();

        System.out.println("Enter no2");
        int b=sc.nextInt();

        System.out.println("Enter choice");
        int choice=sc.nextInt();
        int result;
        switch(choice){

            case 1:
                result=a+b;
                System.out.println(result);
                break;

            case 2:
                result=a-b;
                System.out.println(result);
                break;

            case 3:
                result=a*b;
                System.out.println(result);
                break;

            case 4:
                result=a/b;
                System.out.println(result);
                break;

            default:
                System.out.println("Incorrect choice");
                break;


        }
    }
}
