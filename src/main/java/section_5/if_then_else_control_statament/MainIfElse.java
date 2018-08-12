package section_5.if_then_else_control_statament;

import java.util.Scanner;

public class MainIfElse {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj liczbe naturalna do 5000");
        int giveNumber = scanner.nextInt();

        if(giveNumber <= 1000){
            System.out.println("wygrałes 100 zł");
        }else if(giveNumber > 1000 && giveNumber <= 3000){
            System.out.println("wygrałes 400 zł");

        }else if (giveNumber > 3000 && giveNumber <=5000){
            System.out.println("wygrałeś 1000 zł");
        }else{
            System.out.println("nic nie ygrales");
        }

        scanner.close();



    }
}
