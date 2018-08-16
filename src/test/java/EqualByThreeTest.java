import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import section_5.methods.decimal_comparator_excer.DecimalComparator;

public class EqualByThreeTest {


    private DecimalComparator decimalComparator;


    @Before
    public void createDecimalComparator(){
        decimalComparator = new DecimalComparator();
    }

    @Test
    public void isTrueThatEqualByThreeDecimalOlaces(){

        decimalComparator = new DecimalComparator();
        Assert.assertTrue(decimalComparator.areEqualByThreeDecimalPlaces(-3.175, -3.1756));

    }

    @Test
    public void isTrueThatEqualByThreeDecimalOlaces_2(){

        decimalComparator = new DecimalComparator();
        Assert.assertTrue(decimalComparator.areEqualByThreeDecimalPlaces(3.175, 3.176));

    }

    @Test
    public void isTrueThatEqualByThreeDecimalOlaces_3(){

        decimalComparator = new DecimalComparator();
        Assert.assertTrue(decimalComparator.areEqualByThreeDecimalPlaces(3.0, 3.0));

    }


}
