package section_6_control_flow.while_dowhile_statement;

public class NumberToWords {

    public  static void numberToWords(int number){
        int digitFromLeft;
        int digitFromRight;
        int reverse = 0;
        int count = 0;

        if (number > 0){

            while (number != 0){
                digitFromLeft = number % 10;

                number = number /10;

                reverse = (reverse * 10)+digitFromLeft;

                count++;
            }

            while (reverse != 0) {
                if (reverse == 1) {
                    digitFromRight = reverse % 10;

                    reverse = reverse / 10;
                    System.out.println(digitFromRight+ " ONE");
                    for (int i = 1; i < count; i++) {
                        System.out.println("0 "+ "ZERO");


                    }


                }else{
                    digitFromRight = reverse % 10;

                    reverse = reverse / 10;

                    System.out.print(digitFromRight + "  ");
                    switch (digitFromRight) {
                        case 0:
                            System.out.println("ZERO");
                            break;
                        case 1:
                            System.out.println("ONE");
                            break;
                        case 2:
                            System.out.println("TWO");
                            break;
                        case 3:
                            System.out.println("THREE");
                            break;
                        case 4:
                            System.out.println("FOUR");
                            break;
                        case 5:
                            System.out.println("FIVE");
                            break;
                        case 6:
                            System.out.println("SIX");
                            break;
                        case 7:
                            System.out.println("SEVEN");
                            break;
                        case 8:
                            System.out.println("EIGHT");
                            break;
                        case 9:
                            System.out.println("NINE");
                            break;


                    }
                }
            }


        }else {
            System.out.println("Invalid Value");
        }

    }

    public static void main(String[] args) {
        numberToWords(000005);
    }
}
