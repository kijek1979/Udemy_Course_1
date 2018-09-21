package section_6_control_flow.while_dowhile_statement.last_digit_checker_excer;

public class LastDigitChecker {

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {

        if ((number1 >= 10 && number1 <= 1000) && (number2 >= 10 && number2 <= 1000) && (number3 >= 10 && number3 <= 1000)) {


            int number1Lastdigit = number1 % 10;
            int number2Lastdigit = number2 % 10;
            int number3Lastdigit = number3 % 10;

            if (((number1Lastdigit == number2Lastdigit) || (number2Lastdigit == number3Lastdigit) ||
                    (number3Lastdigit == number1Lastdigit)))
                return true;
            return false;
        }

        return false;

    }

    public static void main(String[] args) {

    }
}
