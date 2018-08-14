package section_5.methods.method_demo_excersise;

import java.util.Scanner;

public class MainDemoExcersise {

    public static void main(String[] args) {


        Methods methods = new Methods();
        Scanner scanner = new Scanner(System.in);

        System.out.println("give me some number");
        int givenNumber = scanner.nextInt();
        methods.checkNumber(givenNumber);

    }
}
