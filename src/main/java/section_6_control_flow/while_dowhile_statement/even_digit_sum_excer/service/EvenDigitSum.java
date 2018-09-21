package section_6_control_flow.while_dowhile_statement.even_digit_sum_excer.service;

import section_6_control_flow.while_dowhile_statement.even_digit_sum_excer.model.NumberForEvenDigitSum;

public class EvenDigitSum {


    private NumberForEvenDigitSum numberForEvenDigitSum;


    public int isNumberPositive(NumberForEvenDigitSum numberForEvenDigitSum) {
        if (numberForEvenDigitSum.getNumber() >= 0)
            return 1;
        return -1;
    }

    public int getEvenDigitSum(NumberForEvenDigitSum numberForEvenDigitSum) {
        int digitsSum = 0;
        int number = numberForEvenDigitSum.getNumber();
        int digit;

        if (isNumberPositive(numberForEvenDigitSum) == 1) {


            while (number != 0) {

                digit = number % 10;
                if ((digit % 2) == 0) {
                    digitsSum = digitsSum + digit;
                }
                number = number / 10;

            }


            return digitsSum;
        }

        return -1;
    }


}
