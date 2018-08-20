package section_5.methods_overloading.seconds_and_minutes_challenge;

public class MainSecondsAndMinutes {
public static int HOURS = 0;
    public static final int MINUTES = 61;
    public static final int SECONDS = 2300;

    public static void main(String[] args) {

        System.out.println(getDurationString());
        System.out.println(getDurationString(2300));



    }




    public static boolean getDurationStringValidation(){
        if ((MINUTES >= 0) && (SECONDS >= 0 && SECONDS <= 59))
            return true;
        return false;

    }

    public static String getDurationString(){

        if(getDurationStringValidation()){

            int minutes = 0;

            if (MINUTES < 60 ){
                minutes = MINUTES;
                return HOURS+"h "+minutes+"m "+SECONDS+"s";

            } else {
                HOURS= MINUTES/60;
                minutes = MINUTES%60;
                return HOURS+"h "+minutes+"m "+SECONDS+"s";

            }
        }
        return "Invalid value";
    }

    public static String getDurationString(int seconds){

        if(seconds < 0){
            return "Invalid value";

        }

        HOURS = MINUTES/60;
        int minutes = seconds / 60;
        int remainingSeconds = seconds % 60;
        return HOURS+"h "+minutes+"m "+remainingSeconds+"s";

    }


}

