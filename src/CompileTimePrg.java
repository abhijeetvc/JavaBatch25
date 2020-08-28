//Method overloading

public class CompileTimePrg {

    void getData(){
        System.out.println("In first method");
    }

    void getData(int a){
        System.out.println("in second method");
    }

    void getData(int b,int c){
        System.out.println("in third method");
    }
    public static void main(String[] args) {
        CompileTimePrg c=new CompileTimePrg();
        c.getData();
        c.getData(10);
        c.getData(20,30);
    }
}
