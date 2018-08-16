import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import section_5.methods.equal_sum_checker_excer.EqualSumChecker;

public class EqualSumCheckerTest {

    private EqualSumChecker equalSumChecker;


    @Before
    public void createEqualSumChecker(){
        equalSumChecker = new EqualSumChecker();
    }

    @Test
    public void isHasEqualSumTrue1(){
        equalSumChecker = new EqualSumChecker();
        Assert.assertTrue(equalSumChecker.hasEqualSum(1, 1, 1));
    }

    @Test
    public void isHasEqualSumTrue2(){
        equalSumChecker = new EqualSumChecker();
        Assert.assertTrue(equalSumChecker.hasEqualSum(1, 1, 2));
    }

    @Test
    public void isHasEqualSumTrue3(){
        equalSumChecker = new EqualSumChecker();
        Assert.assertTrue(equalSumChecker.hasEqualSum(1, -1, 0));
    }
}
