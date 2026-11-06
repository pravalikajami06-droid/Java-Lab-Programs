class Calculator {

    static int power(int num1, int num2) {
        return (int) Math.pow(num1, num2);
    }

    static double power(double num1, int num2) {
        return Math.pow(num1, num2);
    }

    public static void main(String[] args) {
        System.out.println("Integer Power: " + power(2, 3));
        System.out.println("Double Power: " + power(2.5, 3));
    }
}