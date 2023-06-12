package solidPrinciples;

import javax.swing.text.Document;

interface Printer {
    void print(Document document);
}

interface Scanner {
    void scan(Document document);
}

interface FaxMachine {
    void fax(Document document);
}

class MultifunctionPrinter implements Printer, Scanner, FaxMachine {
    @Override
    public void print(Document document) {

    }

    @Override
    public void scan(Document document) {

    }

    @Override
    public void fax(Document document) {

    }
    // implementation of all methods
}

class SimplePrinter implements Printer {
    @Override
    public void print(Document document) {

    }
    // implementation of print method
}

public class ISP {
    public static void main(String[] args){
        System.out.println("inside ISP");
    }
}
