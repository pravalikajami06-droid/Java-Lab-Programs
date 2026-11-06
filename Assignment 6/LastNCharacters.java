import java.util.Scanner;

public class LastNCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter an integer n: ");
        int n = sc.nextInt();

        if (n >= 0 && n <= str.length()) {
            String lastChars = str.substring(str.length() - n);
            String result = lastChars.repeat(n);

            System.out.println("Result: " + result);
        } else {
            System.out.println("Invalid value of n");
        }

        sc.close();
    }
}