package section_6_control_flow.while_dowhile_statement.shared_digit_excer.service;

import section_6_control_flow.while_dowhile_statement.shared_digit_excer.model.DigitsForSharedDigits;

public class SharedDigits implements MethodsForSharedDigits {


    public boolean areNumbersValid(DigitsForSharedDigits digitsForSharedDigits) {
        if (((digitsForSharedDigits.getNumber1() >= 10 && (digitsForSharedDigits.getNumber1() <= 99)) &&
                (digitsForSharedDigits.getNumber2() >= 10) && (digitsForSharedDigits.getNumber2() <= 99)))
            return true;
        return false;
    }

    public boolean hasSharedDigit(DigitsForSharedDigits digitsForSharedDigits) {


        if (areNumbersValid(digitsForSharedDigits)) {
            int number1 = digitsForSharedDigits.getNumber1();
            int number2 = digitsForSharedDigits.getNumber2();

            int digit1 = number1 % 10;
            number1 = number1 / 10;
            int digit2 = number1 % 10;

            int digit3 = number2 % 10;
            number2 = number2 / 10;
            int digit4 = number2 % 10;

            if (digit1 == digit3 || digit1 == digit4 || digit2 == digit3 || digit2 == digit4) {
                return true;
            }


        }
        return false;
    }
}
