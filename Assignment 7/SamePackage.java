package mypack;

public class SamePackage {
    public static void main(String[] args) {
        AccessDemo obj = new AccessDemo();

        System.out.println("Public: " + obj.publicVar);
        System.out.println("Protected: " + obj.protectedVar);
        System.out.println("Default: " + obj.defaultVar);
        obj.display();
    }
}