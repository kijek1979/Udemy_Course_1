import org.junit.Before;
import org.junit.Test;
import section_6_control_flow.while_dowhile_statement.digit_sum_challenge.DigitSum;

import static org.junit.Assert.assertEquals;

public class DigitSumTest {


    private DigitSum digitSum;

    @Before
    public  void createDigitSum (){
        digitSum = new DigitSum();
    }

    @Test
    public void isNumberBiggerOrEqualThan10(){
        digitSum.setNumber(100);
        assertEquals(1, digitSum.isNumberBiggerThan10());
    }

    @Test
    public void  isSumDigitMethodWorking(){
        digitSum.setNumber(-125);
        assertEquals(-1, digitSum.sumDigits());
    }
}
