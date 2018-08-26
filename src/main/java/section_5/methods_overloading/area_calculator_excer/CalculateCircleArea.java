package section_5.methods_overloading.area_calculator_excer;

public class CalculateCircleArea implements Calculating {

    private Parameters circleParameter;


    public void setCircleParameter(Parameters circleParameter) {
        this.circleParameter = circleParameter;
    }

    public double calculateAreas() throws IllegalArgumentException {
        if (circleParameter.getRadius() <= 0) {
            throw new IllegalArgumentException("podano liczbe ujemna co jest błędem");


        } else if (circleParameter.getRadius() == 0) {
            throw new IllegalArgumentException("podano zero co jest błędem");


        }
        return circleParameter.getRadius() * circleParameter.getRadius() * PI_NUMBER;
    }




}
