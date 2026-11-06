interface NumberPrinter {
    void printNumber(Integer num);
}

class Printer implements NumberPrinter {
    public void printNumber(Integer num) {
        System.out.println("Number: " + num);
    }
}

public class NumberPrinterTest {
    public static void main(String[] args) {
        Printer p = new Printer();

        p.printNumber(100);
    }
}