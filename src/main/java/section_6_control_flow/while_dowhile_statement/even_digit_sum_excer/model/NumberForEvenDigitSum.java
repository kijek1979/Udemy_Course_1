package section_6_control_flow.while_dowhile_statement.even_digit_sum_excer.model;

public class NumberForEvenDigitSum {

    private int number;

    public NumberForEvenDigitSum(int number) {
        this.number = number;
    }

    public NumberForEvenDigitSum() {
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "NumberForEvenDigitSum{" +
                "number=" + number +
                '}';
    }
}
