import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import section_6_control_flow.parsing.largest_prime_excer.LargestPrime;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class LargestPrimeTest {


    private LargestPrime largestPrime;


    @Before
    public  void createLargestPrime(){

        largestPrime = new LargestPrime();
    }

    @Test
    public void isNumberBiggerThanZero(){
        Assert.assertTrue(largestPrime.isBiggerThanZero(-21));
    }

    @Test
    public void isNumberPrime(){
        assertTrue(largestPrime.isNumberPrime(-23));

    }

    @Test
    public  void getBiggestPrimeFactorOfNumber(){
        assertEquals(-1, largestPrime.getBiggestPrime(-1));
    }
}
