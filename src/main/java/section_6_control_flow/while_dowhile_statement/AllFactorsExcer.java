package section_6_control_flow.while_dowhile_statement;

public class AllFactorsExcer {

    public static void printFactors(int number) {

        if (number < 1) {
            System.out.println("invalid value");
        } else {
            for (int i = 1; i <= number; i++) {

                if (number % i == 0) {

                    System.out.println(i);

                }


            }
        }
    }

    public static void main(String[] args) {

        printFactors(10);

    }
}
