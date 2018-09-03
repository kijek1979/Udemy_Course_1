import org.junit.Before;
import org.junit.Test;
import section_6_control_flow.for_statement.sum_odd_excer.IsNumberBiggerThanZero;
import section_6_control_flow.for_statement.sum_odd_excer.IsOdd;
import section_6_control_flow.for_statement.sum_odd_excer.SumOdd;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SumOddTest {

    private SumOdd sumOdd;
    private IsNumberBiggerThanZero isNumberBiggerThanZero;
    private IsOdd isOdd;

    @Before
    public void createObjects(){
        isNumberBiggerThanZero = new IsNumberBiggerThanZero();
        isOdd = new IsOdd();
        sumOdd = new SumOdd();
    }


    @Test
    public void isNumberBiggerThanZeroTrue(){
        assertTrue(isNumberBiggerThanZero.isBiggerThanZero(sumOdd.getFirstMethodNumber()));
    }

    @Test
    public  void setIsNumberOddTrue(){
        assertTrue(isOdd.isNumberOdd(sumOdd.getFirstMethodNumber()));
    }

    @Test
    public void isEndBiggerThanStart(){
        assertTrue(SumOdd.isEndBiggerThanStart());
    }

    @Test
    public  void isTaskMethodWorking1(){
        assertEquals(0, sumOdd.sumOdd(sumOdd.getStart(), sumOdd.getEnd()));
    }





}
