public class CommandLineArguments {
    public static void main(String[] args) {
        if (args.length == 2) {
            System.out.println("First String: " + args[0]);
            System.out.println("Second String: " + args[1]);
        } else {
            System.out.println("Please enter exactly two strings.");
        }
    }
}