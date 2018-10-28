package section_6_control_flow.scanner.reading_user_input_challange;

import java.util.Scanner;

public class MainUserInput {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int counter = 0;
        int sum = 0;
        int[] table = new int[10];
        boolean flag = false;


        while ((counter < 10)) {

            System.out.println("Enter number #" + (counter + 1) + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                table[counter] = scanner.nextInt();

                sum += table[counter];
                counter++;
            } else {
                System.out.println("Invalid number");


            }
            scanner.nextLine();


        }



        System.out.println("sum of ten numbers from user is: " + sum);

        scanner.close();


    }
}
