package section_6_control_flow.parsing.largest_prime_excer;

public class LargestPrime {

    public  static boolean isBiggerThanZero(int number){
        if (number < 2)
            return false;
        return true;
    }



    public static boolean isNumberPrime(int number){
        int count = 0;
        if (isBiggerThanZero(number)){
            for (int i = 1; i <=number ; i++) {
                if(number%i == 0){
                    count+=1;
                }
            }
            return ((count > 1) && (count <= 2));
        }
        return false;
    }

    public int getBiggestPrime(int number){


        if (isBiggerThanZero(number)){
            int prime = 0;

            for (int i = 0; i <= number ; i++) {

                if(isNumberPrime(i)){
                    if (number%i == 0){
                        prime = i;

                    }



                }
            }
            return prime;

        }

        return -1;

    }


    public static void main(String[] args) {
        //System.out.println(isPrime(21));
        //System.out.println(getLargestPrime(21));
    }



}
