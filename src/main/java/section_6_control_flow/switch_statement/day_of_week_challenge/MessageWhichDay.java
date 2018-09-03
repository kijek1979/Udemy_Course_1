package section_6_control_flow.switch_statement.day_of_week_challenge;

public class MessageWhichDay implements Observer {


    public void updateDayOfWeek(NumberOfDay numberOfDay)  {

        switch (numberOfDay.getNumberOfDay()) {
            case 1:
                numberOfDay.setDaysOfWeek(DaysOfWeek.TUESDAY);
                System.out.println("dzien zmienil sie na "+numberOfDay.getDaysOfWeek().getDescription());
                break;
            case 2:
                numberOfDay.setDaysOfWeek(DaysOfWeek.WEDNSDAY);
                System.out.println("dzien zmienil sie na "+numberOfDay.getDaysOfWeek().getDescription());
                break;
            case 3:
                numberOfDay.setDaysOfWeek(DaysOfWeek.THURSDAY);
                System.out.println("dzien zmienil sie na "+numberOfDay.getDaysOfWeek().getDescription());
                break;
            case 4:
                numberOfDay.setDaysOfWeek(DaysOfWeek.FRIDAY);
                System.out.println("dzien zmienil sie na "+numberOfDay.getDaysOfWeek().getDescription());
                break;
            case 5:
                numberOfDay.setDaysOfWeek(DaysOfWeek.SATURDAY);
                System.out.println("dzien zmienil sie na "+numberOfDay.getDaysOfWeek().getDescription());
                break;
            case 6:
                numberOfDay.setDaysOfWeek(DaysOfWeek.SUNDAY);
                System.out.println("dzien zmienil sie na "+numberOfDay.getDaysOfWeek().getDescription());
                break;
            case 7:
                numberOfDay.setDaysOfWeek(DaysOfWeek.MONDAY);
                System.out.println("dzien zmienil sie na "+numberOfDay.getDaysOfWeek().getDescription());
                break;

        }



    }
}
