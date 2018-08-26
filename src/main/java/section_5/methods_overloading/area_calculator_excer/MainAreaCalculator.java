package section_5.methods_overloading.area_calculator_excer;

public class MainAreaCalculator {


    public static void main(String[] args) {

        Parameters circleParameter = new Parameters(25);
        CalculateCircleArea calculateCircleArea = new CalculateCircleArea();

        calculateCircleArea.setCircleParameter(circleParameter);
        System.out.println(calculateCircleArea.calculateAreas());


        Parameters rectangleParameter = new Parameters(2, 4);
        CalculateRectangleArea calculateRectangleArea = new CalculateRectangleArea();
        calculateRectangleArea.setParameters(rectangleParameter);
        double scoreRectangle = calculateRectangleArea.calculateAreas();
        System.out.println(scoreRectangle);



    }
}
