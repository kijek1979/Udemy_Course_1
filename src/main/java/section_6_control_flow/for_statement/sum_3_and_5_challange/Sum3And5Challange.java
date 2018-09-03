package section_6_control_flow.for_statement.sum_3_and_5_challange;

public class Sum3And5Challange implements ObligatoryMethods {

    public static void main(String[] args) {

        Sum3And5Challange sum3And5Challange = new Sum3And5Challange();

        sum3And5Challange.isNumberDividedBy3And5();
    }


    public  void isNumberDividedBy3And5() {

        int count = 1;
        int sum = 0;
        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("number "+count+" is "+i);
                sum+=i;
                if (count == 5)
                    break;
                count++;
            }
        }
        System.out.println("--------------");
        System.out.println("sum of "+count+" numbers == " + sum);

    }

    public void printSumOfFiveNumbers() {

    }
}
