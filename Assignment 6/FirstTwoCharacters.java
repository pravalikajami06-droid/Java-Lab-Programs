import java.util.Scanner;

public class FirstTwoCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        int n = str.length();

        if (n >= 2) {
            String result = str.substring(0, 2).repeat(n);
            System.out.println("Result: " + result);
        } else {
            System.out.println("String must contain at least two characters.");
        }

        sc.close();
    }
}