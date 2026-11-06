interface Greeting {
    void sayHello();

    default void sayBye() {
        System.out.println("Goodbye!");
    }
}

class Welcome implements Greeting {
    public void sayHello() {
        System.out.println("Hello! Welcome.");
    }
}

public class GreetingTest {
    public static void main(String[] args) {
        Welcome w = new Welcome();

        w.sayHello();
        w.sayBye();
    }
}