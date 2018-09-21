package section_6_control_flow.while_dowhile_statement.number_palindrome_excer;

public class NumberPalindrome {

    static class PalindromeLogic {

        public boolean sumDigits(int firstNumber) {
            int number = firstNumber;

            int digitFromLeft;
            int reverse = 0;
            int digitFromRight;


            while (number != 0) {
                System.out.println("number po modulo " + (digitFromLeft = number % 10));
                System.out.println("number po dzieleniu " + (number = number / 10));
                System.out.println("reverse: number po mnozeniu " + (reverse = (reverse * 10) + digitFromLeft));
                System.out.println("reverse po modulo " + (digitFromRight = reverse % 10));


            }

            System.out.println(firstNumber);
            System.out.println(reverse);

            if (firstNumber == reverse) {

                System.out.println("true");
                return true;
            }

            return false;
        }

    }

    public static void main(String[] args) {

        PalindromeLogic palindromeLogic = new PalindromeLogic();
        palindromeLogic.sumDigits(1217);

    }
}
