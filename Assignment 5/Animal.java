interface Animal {
    void makeSound();
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
    }
}