public abstract class Car {

    abstract void engineSpec();

    void run(){
        System.out.println("All cars run with top speed of more than 100");
    }
}

class Audi extends Car{

    @Override
    void engineSpec() {
        System.out.println("Audi engine");
    }
}

class Bmw extends Car{

   void speed(){
       System.out.println("Bmw top speed is 400 kmph");
   }
    @Override
    void engineSpec() {
        System.out.println("Bmw Engine");
    }
}

class MainCheck{
    public static void main(String[] args) {
        Audi a=new Audi();
        a.engineSpec();

        Bmw b=new Bmw();
        b.engineSpec();
        b.speed();
        b.run();
    }
}