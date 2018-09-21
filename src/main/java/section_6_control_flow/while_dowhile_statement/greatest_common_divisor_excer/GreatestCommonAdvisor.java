package section_6_control_flow.while_dowhile_statement.greatest_common_divisor_excer;

public class GreatestCommonAdvisor {

    public static int getGreatestCommonAdvisor(int first, int second) {

        int firstDivisor = 0;
        int secondDivisor = 0;
        if ((first > 10 && second > 10)) {

            int smallerNumber = Math.max(first, second);

            for (int gcd = smallerNumber; gcd > 0; gcd--) {

                if ((first % gcd == 0) && (second % gcd == 0)) {

                    System.out.println(gcd);
                    return gcd;
                }




            }
        }
        return -1;
    }

    public static void main(String[] args) {
        getGreatestCommonAdvisor(16, 20);
    }
}
