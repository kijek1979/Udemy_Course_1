package section_6_control_flow.while_dowhile_statement.digit_sum_challenge;

public class DigitSum {

    private int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int isNumberBiggerThan10() {

        if (getNumber() >= 10) {
            return 1;
        }
        return -1;
    }

    public int sumDigits() {
        int sumOfDigits = 0;
        int count = 1;
        int digit;
        int number;

        if (isNumberBiggerThan10() == 1) {
            number = getNumber();
            while (number != 0) {
                System.out.println("cyfra " + count + ": " + (digit = number % 10));
                sumOfDigits = sumOfDigits + digit;
                number = number / 10;
                count++;
            }
            System.out.print("suma cyfr to ");
            return sumOfDigits;
        }
        return -1;
    }

    public static void main(String[] args) {


        int number = 125;

        DigitSum digitSum = new DigitSum();
        digitSum.setNumber(number);

        System.out.println(digitSum.sumDigits());

//        System.out.println(number % 10);
//        System.out.println(number = number / 10);
//        System.out.println(number % 10);
//        System.out.println(number = number / 10);
//        System.out.println(number % 10);
//        System.out.println(number = number / 10);
      System.out.println(1 % 10);

    }
}
