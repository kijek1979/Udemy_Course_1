package section_5.methods.megabytes_converter_excersise;

import java.util.Scanner;

public class MainMegaBytes {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Method method1 = new Method();
        Parameter parameter1 = new Parameter();

        System.out.println("give me kilobytes");

        int givenKilobytes = scanner.nextInt();
        parameter1.setKiloBytes(givenKilobytes);

        method1.printMegaBytesAndKiloBytes(parameter1.getKiloBytes());

    }


}
