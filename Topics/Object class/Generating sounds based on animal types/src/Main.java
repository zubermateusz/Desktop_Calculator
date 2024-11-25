// Java code template starts here
import java.util.*;

public class Main {

    // Define Animal class here
    private static class Animal {
        public String sound;
        public String sound(){
            return this.sound;
        }

    }

    // Define Dog class here
    public static class Dog extends Animal {
        public Dog() {
            this.sound = "Bark!";
        }

    }

    // Define Cat class here
    public static class Cat extends Animal {
        public Cat() {
            this.sound = "Meow!";
        }
    }

    public static void main(String[] args) {

        // In this section, you need to add code to receive input
        // and create the corresponding animal object
        Scanner scanner = new Scanner(System.in);
        String animal = scanner.nextLine();
        Dog dog = new Dog();
        Cat cat = new Cat();
        // Replace the placeholders with the appropriate calls
        if(animal.contains("Dog")) {
            System.out.println(dog.sound());
        } else if(/*Cat?*/animal.contains("Cat")) {
            System.out.println(cat.sound());
        } else {
            System.out.println("Animal type not recognized");
        }
        scanner.close();
    }
} 

// Java code template ends here