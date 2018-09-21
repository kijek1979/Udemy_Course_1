package section_6_control_flow.while_dowhile_statement.first_last_digit_sum_excer;

public class FirstAndLastDigitsSum implements FirstAndLast{

    private int number;

    public FirstAndLastDigitsSum(int number) {
        this.number = number;
    }

    public FirstAndLastDigitsSum() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isNumberBiggerThanZero(FirstAndLastDigitsSum firstAndLastDigitsSum) {


            return firstAndLastDigitsSum.getNumber() > 0;

    }

    public int sumFirstAndLastDigit(FirstAndLastDigitsSum firstAndLastDigitsSum) {

       int digitFromLeft;
       int digitFromRight = 0;
        int lastDigit;
        int reverse = 0;
        int number = firstAndLastDigitsSum.getNumber();
        if(firstAndLastDigitsSum.isNumberBiggerThanZero(firstAndLastDigitsSum)){
            lastDigit = number % 10;
            while (number != 0){
                while (number != 0) {

                    System.out.println("number po modulo " + (digitFromLeft = number % 10));
                    System.out.println("number po dzieleniu " + (number = number / 10));
                    System.out.println("reverse: number po mnozeniu " + (reverse = (reverse * 10) + digitFromLeft));
                    System.out.println("reverse po modulo " + (digitFromRight = reverse % 10));
                }
                System.out.print("suma cyfr to ");
                return lastDigit+digitFromRight;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstAndLastDigitsSum firstAndLastDigitsSum = new FirstAndLastDigitsSum(98259);
        System.out.println(firstAndLastDigitsSum.sumFirstAndLastDigit(firstAndLastDigitsSum));
    }
}
