package section_5.methods.equal_sum_checker_excer;

public class EqualSumChecker {


    public boolean hasEqualSum(int a, int b, int c) {
        int sumOfAandB = a + b;
        if(sumOfAandB == c)
            return true;
        return false;
    }
}
