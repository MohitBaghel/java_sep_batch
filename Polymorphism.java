public class Polymorphism {

    public static void main(String[] args) {
        // Animal animal1 = new Animal(); // Animal reference and object
        // Animal lion  = new Lion();
        // Animal cat  = new Cat();
        Animal dog  = new Dog();
        
        dog.sound();

    }

    

    
}


// Superclass
class Animal{
    void sound(){
        System.out.println("Animal makes a sound");
    }
}


// subclasses1
class Lion extends Animal{
    void sound(){
        System.out.println("Lion roars");
    }
}

// subclasses2
class Cat extends Animal{
    void sound(){
        System.out.println("Cat meows");
    }
}


// subclasses3
class Dog extends Animal{
    void sound(){
        super.sound();
        System.out.println("Dog barks");
    }
}