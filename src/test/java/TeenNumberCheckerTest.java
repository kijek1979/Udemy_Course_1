import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import section_5.methods.teen_number_checker_excer.TeenNumberChecker;

public class TeenNumberCheckerTest {

    private TeenNumberChecker teenNumberChecker;

    @Before
    public void createTeenNumberChecker(){
        TeenNumberChecker teenNumberChecker = new TeenNumberChecker();
    }

    @Test
    public void isHasTeenTrue1(){
        teenNumberChecker = new TeenNumberChecker();
        Assert.assertTrue(teenNumberChecker.hasTeen(9, 99, 19));
    }

    @Test
    public void isHasTeenTrue2(){
        teenNumberChecker = new TeenNumberChecker();
        Assert.assertTrue(teenNumberChecker.hasTeen(23, 15, 42));
    }

    @Test
    public void isHasTeenTrue3(){
        teenNumberChecker = new TeenNumberChecker();
        Assert.assertTrue(teenNumberChecker.hasTeen(22, 23 , 34));
    }
}
