//Polymorphism: Same name having multiple forms
//Types: 2 types
//  --> a) Runtime Polymorphism: Can be achieved through method overriding
//  b) Compile Time Polymorphism: Can can be achieved through method overloading

class Vehicle{
    void run(){
        System.out.println("In vehicle class");
    }
}

public class PolymorphismPrg extends Vehicle{

    void run(){  //Overriden method
        super.run();
        System.out.println("In child class");
    }

    public static void main(String[] args) {
        PolymorphismPrg p=new PolymorphismPrg();
        p.run();
    }
}
