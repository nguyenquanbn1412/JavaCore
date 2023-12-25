// Define the first interface
interface Flyable {
    void fly();
}

// Define the second interface
interface Swimmable {
    void swim();

    void fly();
}

// Define the third interface that implements both Flyable and Swimmable
interface FlyingAndSwimming extends Flyable, Swimmable {
    void dive();
}


// Create a class that implements the FlyingAndSwimming interface
class Bird implements FlyingAndSwimming {
    @Override
    public void fly() {
        System.out.println("The bird is flying.");
    }

    @Override
    public void swim() {
        System.out.println("The bird is swimming.");
    }

    @Override
    public void dive() {
        System.out.println("The bird is diving.");
    }
}

public class Test {
    public static void main(String[] args) {
        // Create an object of Bird
        Bird myBird = new Bird();

        // Call methods from the implemented interfaces
        myBird.fly();
        myBird.swim();
        myBird.dive();
    }
}
