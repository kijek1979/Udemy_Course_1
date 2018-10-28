package section_6_control_flow.scanner.min_and_max_challange;

import java.util.Scanner;

public class MainMinMax {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int minNumber = 0;
        int maxNumber = 0;
        String note = "To break the loop write letter";
        int countOfNote = 0;
        int count = 1;

        System.out.println(note);
       while (true){

           if (countOfNote <= 5) {

               countOfNote++;
           }else{
               System.out.println(note);
               countOfNote-=5;
           }
           System.out.println("Enter the number");
           boolean hasNextInt = scanner.hasNextInt();
           if (hasNextInt){

               int number = scanner.nextInt();

               if (count == 1){
                   minNumber = number;
                   maxNumber = number;
                   count++;

               }else if(count >= 2){
                   if (number < minNumber){
                       minNumber = number;
                   }else {
                       maxNumber = number;
                   }
                   count++;

               }






           }else {
               System.out.println("Invalid number");
               break;
           }

           scanner.nextLine();


       }
        System.out.println("max number is: "+maxNumber+'\n'+"min number is: "+ minNumber);
       scanner.close();
    }
}
