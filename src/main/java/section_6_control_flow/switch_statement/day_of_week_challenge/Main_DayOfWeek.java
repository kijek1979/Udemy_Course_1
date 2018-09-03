package section_6_control_flow.switch_statement.day_of_week_challenge;

public class Main_DayOfWeek {

    public static void main(String[] args) {

        //napisac własny wyjątek

        NumberOfDay numberOfDay = new NumberOfDay(2);
        MessageWhichDay messageWhichDay = new MessageWhichDay();

        System.out.println(numberOfDay.toString());
        System.out.println();

        //messageWhichDay.updateDayOfWeek(numberOfDay);

        numberOfDay.registerObsrver(messageWhichDay);
        numberOfDay.notifyObserver();
        numberOfDay.changeOrderStatus(DaysOfWeek.SUNDAY);






    }


}
