class MathOperations {
    int add(int a, int b) {
        return a + b;
    }

    int subtract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    double divide(int a, int b) {
        return (double) a / b;
    }
}

public class MathTest {
    public static void main(String[] args) {
        MathOperations m = new MathOperations();

        System.out.println("Addition: " + m.add(20, 10));
        System.out.println("Subtraction: " + m.subtract(20, 10));
        System.out.println("Multiplication: " + m.multiply(20, 10));
        System.out.println("Division: " + m.divide(20, 10));
    }
}