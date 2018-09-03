import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import section_6_control_flow.switch_statement.number_in_word_excer.NumberInWord;
import section_6_control_flow.switch_statement.number_in_word_excer.NumberInWordMethod;
import section_6_control_flow.switch_statement.number_in_word_excer.WrongScopeOfNumberException;

public class NumberInWordTest {

    private NumberInWord numberInWord;

    @Before
    public void createNumberInWord(){

        numberInWord = new NumberInWord();
    }

    @Test
    public void firstTestOfNumberInWordMethodWithNullReturn() throws WrongScopeOfNumberException {

        Assert.assertNull(numberInWord.printNumberInWord(NumberInWordMethod.NUMBER));
    }


    @Test
    public void isNumberInWordMethodReturningString1() throws WrongScopeOfNumberException{

        Assert.assertEquals("metoda przechodzi test z 0", "zero".toUpperCase(), numberInWord.printNumberInWord(0.0));
    }

    @Test
    public void isNumberInWordMethodReturningString2() throws WrongScopeOfNumberException{

        Assert.assertEquals("metoda przechodzi test z 1", "one".toUpperCase(), numberInWord.printNumberInWord(1.0));
    }
    @Test
    public void isNumberInWordMethodReturningString3() throws  WrongScopeOfNumberException {

        Assert.assertEquals("metoda przechodzi test z 2", "two".toUpperCase(), numberInWord.printNumberInWord(2.0));
    }


    @Test(expected = WrongScopeOfNumberException.class)
    public void  expectedMyOwnException () throws WrongScopeOfNumberException {
        numberInWord.printNumberInWord(34);
    }



}
