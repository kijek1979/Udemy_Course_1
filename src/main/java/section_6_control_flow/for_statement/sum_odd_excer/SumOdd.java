package section_6_control_flow.for_statement.sum_odd_excer;

public class SumOdd {

    private int firstMethodNumber = 32;

    private int start = 100;
    private int end = 100;

    public int getFirstMethodNumber() {
        return firstMethodNumber;
    }

    public void setFirstMethodNumber(int firstMethodNumber) {
        this.firstMethodNumber = firstMethodNumber;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public int sumOdd(int start, int end){
        IsNumberBiggerThanZero isNumberBiggerThanZero = new IsNumberBiggerThanZero();

        IsOdd isOdd = new IsOdd();
        int sum = 0;
        if(isEndBiggerThanStart() && isNumberBiggerThanZero.isBiggerThanZero(start)
                && isNumberBiggerThanZero.isBiggerThanZero(end)) {

            for (int i = start; i <= end; i++) {
                if (isOdd.isNumberOdd(i)){
                    System.out.println(i);
                    sum = sum+i;
                }

            }
            System.out.println("------------");
            return sum;

        }else {

            return -1;
        }


    }

    public static  boolean isEndBiggerThanStart() {
        SumOdd sumOdd = new SumOdd();
        if(sumOdd.getEnd() >= sumOdd.getStart())
            return true;
        return false;
    }


    public static void main(String[] args) {

        IsNumberBiggerThanZero isNumberBiggerThanZero = new IsNumberBiggerThanZero();
        IsOdd isOdd = new IsOdd();
        SumOdd sumOdd = new SumOdd();

        System.out.println(8%2);


        System.out.println(sumOdd.sumOdd(sumOdd.getStart(), sumOdd.getEnd()));



    }



}
