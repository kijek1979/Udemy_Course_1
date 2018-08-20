import org.junit.Assert;
import org.junit.Test;
import section_5.methods_overloading.MainMethodsOverloading;
import section_5.methods_overloading.Numbers;

import static section_5.methods_overloading.MainMethodsOverloading.calcFeetAndInchesToCentimetersValidation;

public class CalcFeetAndInchesTest {

    private MainMethodsOverloading mainMethodsOverloading;
    private Numbers numbers;

    @Test
    public void isFeetAndInchesValidate(){
        MainMethodsOverloading mainMethodsOverloading = new MainMethodsOverloading();
        Numbers numbers = new Numbers();
        Assert.assertNotEquals(1, calcFeetAndInchesToCentimetersValidation(numbers.getNumber_1(), numbers.getNumber_2()));
    }
}
