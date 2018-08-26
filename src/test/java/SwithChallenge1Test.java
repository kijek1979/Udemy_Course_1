import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import section_6_control_flow.switch_statement.SwithChallenge1;

public class SwithChallenge1Test {

    private SwithChallenge1 swithChallenge1;


    @Before
    public void createSwitchChallenge1() {

        swithChallenge1 = new SwithChallenge1();
    }

    @Test
    public void isSwitchReturningCorrectCharVariable(){

        Assert.assertArrayEquals(swithChallenge1.chars, swithChallenge1.switchMethod());
    }
}
