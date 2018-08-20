package section_5.methods.teen_number_checker_excer;

public class TeenNumberChecker {

    public static void main(String[] args) {

        //System.out.println(hasTeen(9,19,99));
    }



    public  boolean hasTeen(int a, int b, int c) {
        int min = 13;
        int max = 19;
        if((a >= min && a <= max) || (b >= min && b <= max) || (c >= min && c <= max))
            return true;
        return false;

    }
}
