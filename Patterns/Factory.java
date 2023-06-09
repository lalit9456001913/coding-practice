
//Factory Pattern:
//The Factory pattern is used when you want to create objects without exposing the instantiation logic to the client. It encapsulates object creation in a separate factory class or method.
//package Patterns;

interface Animal {
    void makeSound();
}

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}

class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}

class Factory {
    public static Animal createAnimal(String type) {
        if (type.equalsIgnoreCase("Dog")) {
            return new Dog();
        } else if (type.equalsIgnoreCase("Cat")) {
            return new Cat();
        }
        throw new IllegalArgumentException("Invalid animal type.");
    }

    public static void main(String[] args){

        Animal dog = Factory.createAnimal("Dog");
        dog.makeSound();  // Output: Woof!

        Animal cat = Factory.createAnimal("Cat");
        cat.makeSound();  // Output: Meow!
    }
}
