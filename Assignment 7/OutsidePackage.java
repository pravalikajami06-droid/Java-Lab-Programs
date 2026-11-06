import mypack.AccessDemo;

class OutsidePackage extends AccessDemo {
    public static void main(String[] args) {
        OutsidePackage obj = new OutsidePackage();

        System.out.println("Public: " + obj.publicVar);
        System.out.println("Protected: " + obj.protectedVar);
    }
}