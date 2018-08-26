package section_5.methods_overloading.equality_printer_excer;

public class EqualityPrinter implements EqulityPrinterParameters {


    public void printEqual() {

        if(A < 0 || B < 0 || C < 0) {
            System.out.println("Invalid Value");
        } else if (A==B && B==C && C==A) {
            System.out.println("All numbers are equall");
        } else if (A!=B && B!=C && C!=A){
                System.out.println("All numbers are different");


        }else {
            System.out.println("Neither all are equal or different");


        }
    }

    public static void main(String[] args) {
        EqualityPrinter equalityPrinter = new EqualityPrinter();
        equalityPrinter.printEqual();
    }
}
