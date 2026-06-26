
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// Animal System

// Create:

// Animal class
// Dog, Cat, Cow subclasses

// Each should implement:
// makeSound()


class Practice8 {
    static class Animal{
        void makeSound(){
            System.out.println("Animal Makes Sound : ");
        }
    }
    
    static class Dog extends Animal{
        void makeSound(){
            System.out.println("Animal Makes Sound : Dog Barks");
        }
    }
    
    static class Cat extends Animal{
        void makeSound(){
            System.out.println("Cat Meows");
        }
    }
    public static void main(String[] args) {
       Dog d = new Dog();
       Cat c = new Cat();
       d.makeSound();
       c.makeSound();
    }
}