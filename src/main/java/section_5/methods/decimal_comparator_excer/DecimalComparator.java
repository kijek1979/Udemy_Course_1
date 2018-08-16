package section_5.methods.decimal_comparator_excer;

public class DecimalComparator {



    public boolean areEqualByThreeDecimalPlaces(Double a, Double b) {


        if( (int)( a * 1000 ) == (int)(b * 1000))
            return true;

        return false;


    }
}
