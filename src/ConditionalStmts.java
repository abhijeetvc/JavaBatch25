import java.util.Scanner;

public class ConditionalStmts {

    public static void main(String[] args) {
        int a=22;
        if(a>21){
            System.out.println("Adult");
        }else{
            System.out.println("Child");
        }

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks for Student: ");
        int marks=sc.nextInt();
        if(marks>80){
            System.out.println("Grade A");
        }else if(marks>=70 && marks<80){
            System.out.println("Grade B");
        }else if(marks>=60 && marks<70){
            System.out.println("Grade C");
        }else{
            System.out.println("Grade D");
        }
    }
}
