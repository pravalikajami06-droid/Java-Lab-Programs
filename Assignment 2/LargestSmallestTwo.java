import java.util.Arrays;

public class LargestSmallestTwo {
    public static void main(String[] args) {
        int[] arr = {25, 10, 45, 5, 30, 15};

        Arrays.sort(arr);

        System.out.println("Smallest two numbers: " + arr[0] + " and " + arr[1]);

        System.out.println("Largest two numbers: " +
                arr[arr.length - 2] + " and " + arr[arr.length - 1]);
    }
}