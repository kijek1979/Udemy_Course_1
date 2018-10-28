package section_6_control_flow.parsing.diagonal_star_excer;

public class DiagonalStar {

    public static String printSquareStar(int number) {

        String star = "*";

        if (number >= 5) {

            for (int i = 0; i < number; i++) {

                for (int j = 0; j < number; j++) {
                    if (i == 0 || (i == number - 1) || j == 0 || (j == number - 1) || (i == j) || ((j + 1) == number - (i + 1) + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }

                }
                System.out.println();




            }
        }

        return ("Invalid Value");

    }


    public static void main(String[] args) {
//        printSquareStar(6);
//        System.out.println();






    }

}
