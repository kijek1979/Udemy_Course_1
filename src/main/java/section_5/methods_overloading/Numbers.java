package section_5.methods_overloading;

public class Numbers {

    private double number_1;
    private double number_2;

    public Numbers(double number_1, double number_2) {
        this.number_1 = number_1;
        this.number_2 = number_2;
    }

    public Numbers() {
    }

    public double getNumber_1() {
        return number_1;
    }

    public void setNumber_1(double number_1) {
        this.number_1 = number_1;
    }

    public double getNumber_2() {
        return number_2;
    }

    public void setNumber_2(double number_2) {
        this.number_2 = number_2;
    }
}
