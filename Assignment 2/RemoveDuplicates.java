import java.util.LinkedHashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = {10, 20, 10, 30, 20, 40, 50, 30};

        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        for (int num : arr) {
            set.add(num);
        }

        System.out.println("Array after removing duplicate elements:");

        for (int num : set) {
            System.out.print(num + " ");
        }
    }
}