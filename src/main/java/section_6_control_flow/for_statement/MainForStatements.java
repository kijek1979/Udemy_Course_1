package section_6_control_flow.for_statement;

public class MainForStatements {

    public static void main(String[] args) {


        //calculateInterest(10000.0);
        printPrimeNumbersFrom1To100();
    }

    public static double calculateInterest(double amount){

        for (double i = 8; i >= 2 ; i--) {
             double calculatedInterest = (amount * (i/100.0));
            System.out.println(amount+" at "+i+"% interest= "+String.format("%.2f",calculatedInterest) );
        }
        return 0;
    }

    public static boolean isPrime(int n){
        if(n <= 1){
            return false;
        }

        for (int i = 2; i <= n/2 ; i++) {
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }


    public static void printPrimeNumbersFrom1To100(){

        int count = 1;
        for (int i = 0; i <= 100 ; i++) {
            if (isPrime(i)){
                System.out.println(i);

                if(count == 3){
                    break;
                }
                count++;
            }
        }

    }
}
