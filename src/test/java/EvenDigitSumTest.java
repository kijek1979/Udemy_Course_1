import org.junit.Before;
import org.junit.Test;
import section_6_control_flow.while_dowhile_statement.even_digit_sum_excer.model.NumberForEvenDigitSum;
import section_6_control_flow.while_dowhile_statement.even_digit_sum_excer.service.EvenDigitSum;

import static org.junit.Assert.assertEquals;

public class EvenDigitSumTest {

    private NumberForEvenDigitSum numberForEvenDigitSum;
    private EvenDigitSum evenDigitSum;

    @Before
    public void createNumberForEvenDigitSum(){
        numberForEvenDigitSum = new NumberForEvenDigitSum(123456789);
        evenDigitSum = new EvenDigitSum();
    }

    @Test
    public void isNumberPositiveWorking(){
        assertEquals(1, evenDigitSum.isNumberPositive(numberForEvenDigitSum));
    }

    @Test
    public void isGetEvenDigitSumMethodWorking(){
        assertEquals(20, evenDigitSum.getEvenDigitSum(numberForEvenDigitSum));
    }
}
