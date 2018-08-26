import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import section_5.methods_overloading.area_calculator_excer.CalculateCircleArea;
import section_5.methods_overloading.area_calculator_excer.CalculateRectangleArea;
import section_5.methods_overloading.area_calculator_excer.Parameters;

public class AreaCalculatorTest {

    private Parameters parameters;
    private  CalculateCircleArea calculateCircleArea;
    private CalculateRectangleArea calculateRectangleArea;

    @Before
    public void createParameters(){
        parameters = new Parameters();
    }

    @Before
    public  void createCalculateCircleArea(){
        calculateCircleArea = new CalculateCircleArea();
    }

    @Before
    public void createCalculateRectangleArea(){
        calculateRectangleArea = new CalculateRectangleArea();

    }

    @Test
    public void isCalculateAreasOfCircleWorking (){
        parameters = new Parameters();
        calculateCircleArea = new CalculateCircleArea();
        Assert.assertEquals(calculateCircleArea.calculateAreas(), 1963.49374, 5);

    }

    @Test
    public void isCalculateAreasOfRectangleWorking(){
        parameters = new Parameters();
        calculateRectangleArea = new CalculateRectangleArea();
        Assert.assertEquals(calculateRectangleArea.calculateAreas(), 8,0);


    }
}
