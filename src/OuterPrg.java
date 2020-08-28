//Inner Class: One class inside another class.
// Types: a) Nested inner class, b) Local Inner class, c) Anonymous inner class,
//        d) Static nested class

abstract class AnonynousDemo{
    abstract void checkData();
}

public class OuterPrg {
    void check() {
        class InnerPrg {
            void display() {
                System.out.println("In display method");
            }
        }
        InnerPrg in=new InnerPrg();
        in.display();
    }
    void display1(){
        System.out.println("In display1");
    }

    void getData(){

        AnonynousDemo a=new AnonynousDemo() {
            @Override
            void checkData() {
                System.out.println("In checkdata method of anonymous class");
            }
        };
        a.checkData();
    }

    static class DemoCheck{
        void checkStatic(){
            System.out.println("In static class");
        }
    }
}

class MainCheckClass{
    public static void main(String[] args) {
        OuterPrg o=new OuterPrg();
        o.display1();
//        OuterPrg.InnerPrg in=o.new InnerPrg();
//        in.display();
        o.check();
        o.getData();

        OuterPrg.DemoCheck od=new OuterPrg.DemoCheck();
        od.checkStatic();

    }
}