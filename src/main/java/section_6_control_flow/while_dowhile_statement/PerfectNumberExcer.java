package section_6_control_flow.while_dowhile_statement;

public class PerfectNumberExcer {


    public static boolean isPerfectNumber(int number) {
        if (number > 1) {

            int sum = 0;


            for (int i = 1; i < number; i++) {

                if (number % i == 0) {

                    System.out.println(i);
                    sum = sum + i;
                    if (sum == number) {
                        System.out.println("its perfect number "+sum);
                        return true;
                    }


                }


            }
        }

        return false;
    }

    public static void main(String[] args) {
        isPerfectNumber(6);
    }
}
