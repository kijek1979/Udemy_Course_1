import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import section_6_control_flow.while_dowhile_statement.first_last_digit_sum_excer.FirstAndLastDigitsSum;

import static org.junit.Assert.assertEquals;

public class FirstAndLastDigitsSumTest {


    private FirstAndLastDigitsSum firstAndLastDigitsSum;

    @Before
    public void createNumber(){
        firstAndLastDigitsSum = new FirstAndLastDigitsSum(125);
    }

    @Test
    public  void isConditionNegativeNumberworking(){

        Assert.assertTrue(firstAndLastDigitsSum.isNumberBiggerThanZero(firstAndLastDigitsSum));
    }

    @Test
    public void isFirstAndLastDigitsSumWorking(){
        assertEquals(6, firstAndLastDigitsSum.sumFirstAndLastDigit(firstAndLastDigitsSum));
    }


}
