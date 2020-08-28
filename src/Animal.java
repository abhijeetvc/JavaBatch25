//Inheritance: One of the key features of the object oriented programming language.
// Used to achieve code reusability
// Inheritance is also called as 'is-a' relationship
// Types: Single , Multilevel, Hierarchical, Hybrid, Multiple(NA)

// super -> used to access fields, methods, contructors of parent class

// final -> can be used with variables, methods, class
public class Animal {

    final String color="black";
    void eat(){
       // color="yellow";
        System.out.println("All animals eat");
    }
}

class Dog extends Animal{

    void bark(){
       // super.eat();   // calling method of parent class
        System.out.println("Dogs bark");
    }

//    public static void main(String[] args) {
//        Dog d=new Dog();
//        d.eat();
//        d.bark();
//    }
}

class Puppy extends Dog{  //Multi-Level In

    void bark(){     //overriden method
        super.bark();
        System.out.println("Puppy barks very loudly");
    }

    public static void main(String[] args) {
        Puppy p=new Puppy();
        p.eat();
        p.bark();

    }
}

//A  -> B -> C -> D   // Multilevel

// A -> B   // hierarchical
// A -> C
