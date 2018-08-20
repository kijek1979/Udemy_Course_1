package section_5.methods_overloading;

public class MainMethodsOverloading {

    public static void main(String[] args) {

       Numbers numbers = new Numbers(2, 15);


        calcFeetAndInchesToCentimeters(numbers.getNumber_1(), numbers.getNumber_2());


    }


   public static void calcFeetAndInchesToCentimeters(double feet, double inches) {

        if(calcFeetAndInchesToCentimetersValidation(feet, inches) == 1) {

            System.out.println(calcFeetAndInchesToCentimetersValidation(feet, inches));
            System.out.println(feet + " feet is equal to " + (feet * 30.48) + " cm");
            System.out.println(inches + " inches is equal to " + (inches * 2.54) + " cm");

        }else if (calcFeetAndInchesToCentimetersValidation(feet, inches) == -1){
            System.out.println(calcFeetAndInchesToCentimetersValidation(feet, inches));
        }

   }


    public static double calcFeetAndInchesToCentimetersValidation(double feet, double inches){

        if((feet >= 0) && (inches >= 0 && inches <= 12)){
            return 1.0;
        }
        return -1.0;
    }








}
