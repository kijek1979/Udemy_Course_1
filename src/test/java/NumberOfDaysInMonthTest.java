import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import section_6_control_flow.switch_statement.number_of_days_in_month_excer.NumberOfDaysInMonth;
import section_6_control_flow.switch_statement.number_of_days_in_month_excer.ScopeOfYearParameterException;
import section_6_control_flow.switch_statement.number_of_days_in_month_excer.YearParameter;

import static org.junit.Assert.assertEquals;

public class NumberOfDaysInMonthTest {


    private NumberOfDaysInMonth numberOfDaysInMonth;

    @Before
    public void createNumber() {
        numberOfDaysInMonth = new NumberOfDaysInMonth();
    }

    @Test(expected = ScopeOfYearParameterException.class)
    public void isScopeOfYearParameterExceptionWorking() {
        numberOfDaysInMonth.isLeapYear(YearParameter.year);
    }

    @Test
    public void isLeapYearMethodReturningTrue() {
        Assert.assertTrue(numberOfDaysInMonth.isLeapYear(YearParameter.year));
    }

    @Test
    public void isGetDaysInMonthYearsAndDaysConditionWorking(){
        assertEquals(-1, numberOfDaysInMonth.getDaysInMonth(9, 1987444));
    }



    @Test
    public void ifGetDaysInMonthYearsAndDaysConditionIsWorkingSoIsAllMethodWorking(){
        assertEquals(-1, numberOfDaysInMonth.getDaysInMonth(1, -2020));
    }

    @Test(expected = ScopeOfYearParameterException.class)
    public void isGetDaysInMonthYearsAndDaysConditionThrowingException(){
        numberOfDaysInMonth.getDaysInMonthwithException(8, 220);
    }

}
