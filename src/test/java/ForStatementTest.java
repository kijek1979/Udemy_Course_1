import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import section_6_control_flow.for_statement.MainForStatements;

public class ForStatementTest {

    private MainForStatements mainForStatements;

    @Before
    public void createForClass() {
        mainForStatements = new MainForStatements();
    }

    @Test
    public void isNumberFromisPrimeMethodTrue() {

        Assert.assertTrue(mainForStatements.isPrime(97));
    }


}
