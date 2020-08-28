//Method: access modifier, return type, name, may or may not have parameters, body

public class MethodsPrg {

    void display(){
        System.out.println("hiiiiiiii");
    }

    int display1(int a,int b){
        display();
        int result=a+b;
        return result;
    }

    public static void main(String[] args) {
        MethodsPrg m=new MethodsPrg();
       // m.display();
        int i=m.display1(20,30);
        System.out.println(i);
    }
}
