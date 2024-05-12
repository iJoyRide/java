// Main class to demonstrate generics
public class expGenerics {
    public static void main(String[] args) {
        // Creating an IntegerPrinter instance to print an Integer
        IntegerPrinter printer = new IntegerPrinter(23);
        printer.print();

        // Creating a Printer instance to print a String
        Printer<String> printer1 = new Printer<>("Hello World");
        printer1.print();

        // Creating a Printer instance to print a Double
        Printer<Double> printer2 = new Printer<>(55.67);
        printer2.print();
    }
}

// Class to print an Integer
class IntegerPrinter {
    Integer thingToPrint;

    public IntegerPrinter(Integer newInt) {
        this.thingToPrint = newInt;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}

// Generic class to print any type of object
class Printer<T> {
    T thingToPrint;

    public Printer(T newInt) {
        this.thingToPrint = newInt;
    }

    public void print() {
        System.out.println(thingToPrint);
    }
}
