package section_6_control_flow.while_dowhile_statement.shared_digit_excer;

import section_6_control_flow.while_dowhile_statement.shared_digit_excer.model.DigitsForSharedDigits;
import section_6_control_flow.while_dowhile_statement.shared_digit_excer.service.SharedDigits;

public class MainSharedDigits {

    public static void main(String[] args) {
        DigitsForSharedDigits digitsForSharedDigits = new DigitsForSharedDigits(26,12);
        SharedDigits sharedDigits = new SharedDigits();


        System.out.println(sharedDigits.hasSharedDigit(digitsForSharedDigits));


    }
}
