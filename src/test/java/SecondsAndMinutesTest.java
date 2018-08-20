import org.junit.Assert;
import org.junit.Test;
import section_5.methods_overloading.seconds_and_minutes_challenge.MainSecondsAndMinutes;

import static section_5.methods_overloading.seconds_and_minutes_challenge.MainSecondsAndMinutes.getDurationStringValidation;

public class SecondsAndMinutesTest {

    //MainSecondsAndMinutes mainSecondsAndMinutes= new MainSecondsAndMinutes();

    @Test
    public void isGetDurationStringValidationTrue(){
        MainSecondsAndMinutes mainSecondsAndMinutes = new MainSecondsAndMinutes();
        Assert.assertTrue(getDurationStringValidation());

    }

    //public
}
