package section_6_control_flow.while_dowhile_statement;

public class MainWhile {
    public static void main(String[] args) {


        int number = 6;


//        do {
//            System.out.println("count was " + count);
//            ++count;
//            if (count == 34455) {
//
//                break;
//            }
//
//        } while (count != 6);

        int sum = 0;
        int count = 0;

//        while (number < 134) {
//            if (count < 5) {
//                number++;
//                if (isEvenNumber(number)) {
//                    System.out.println(number);
//                    count++;
//                    sum += number;
//                }
//            } else {
//                System.out.println(sum);
//                break;
//            }
//        }

        while (count < 15){
            count++;

            if(count <= 5){
                System.out.println("skipping number "+count);
                continue;
            }

            System.out.println("number "+count);

            if (count>=10){
                System.out.println("breaking at "+count);
                break;
            }
        }


    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }
}
