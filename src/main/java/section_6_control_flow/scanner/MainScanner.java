package section_6_control_flow.scanner;

import java.util.Scanner;

public class MainScanner {

    public static void main(String[] args) throws WrongNumberOfYearException {

        Scanner scanner = new Scanner(System.in);
        boolean flag = false;

        System.out.println("enter your name: ");
        String name = scanner.nextLine();
        System.out.println("enter yer of birth: ");
        boolean hasNextInt = scanner.hasNextInt();

        if (hasNextInt) {


            int numberFromScanner = scanner.nextInt();
            scanner.nextLine();


            int age;

            if ((numberFromScanner >= 1860) && (numberFromScanner <= 2018)) {
                age = 2018 - numberFromScanner;
                System.out.println(" " + name + " " + age);

            } else {

                throw new WrongNumberOfYearException("podany zle liczbe");
            }
        }else {
            System.out.println("podano litere");
        }







        scanner.close();
    }
}
