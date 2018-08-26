package section_5.methods_overloading.minutes_to_years_excer;

public class MinutesToYearsAndDays {

    public static void printYearsAndDays(long minutes){
        double days = (double) minutes / 1440;
        long Days = minutes / 1440;
        long years = minutes / 525600;
        if (minutes < 0 ){
            System.out.println("invalid value");
        } else{
            if (minutes <= 1440) {

                System.out.println(minutes+" min = "+0+" y and "+days+" days");

            } else {

                long remainingDays = (minutes % 525600)/1440;

                if (minutes % 525600 == 0) {
                    System.out.println(minutes + " min = " + years + " years and " + 0 + " days");
                }else {
                    System.out.println(minutes + " min = " + years + " years and " + remainingDays + " days");
                }



            }
        }

    }

    public static void eetr(long minutes) {



        long years = minutes / 525600;
        long remainingDays = (minutes % 525600)/1440;
        if (minutes < 0) {
            System.out.println("invalid value");
        } else {

            System.out.println(minutes + " min = " + years + " years and " + remainingDays + " days");


        }
    }

    public static void main(String[] args) {

        eetr(0);
    }
}
