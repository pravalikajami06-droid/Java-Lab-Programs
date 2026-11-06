interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class MultiFunctionDevice implements Printer, Scanner {
    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

public class PrinterScanner {
    public static void main(String[] args) {
        MultiFunctionDevice m = new MultiFunctionDevice();

        m.print();
        m.scan();
    }
}