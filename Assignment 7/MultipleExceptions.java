public class MultipleExceptions {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30};

        try {
            int result = 10 / 0;
            System.out.println(result);

            System.out.println(arr[5]);
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: Division by zero");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out of Bounds Exception");
        }

        System.out.println("Program continues...");
    }
}