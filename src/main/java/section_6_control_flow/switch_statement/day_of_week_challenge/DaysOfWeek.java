package section_6_control_flow.switch_statement.day_of_week_challenge;

public enum DaysOfWeek  {

    MONDAY("poniedziałek"),
    TUESDAY("wtorek"),
    WEDNSDAY("środa"),
    THURSDAY("czwartek"),
    FRIDAY("piątek"),
    SATURDAY("sobota"),
    SUNDAY("niedziela");

    private String description;

    DaysOfWeek (String desc){
        this.description = desc;
    }

    public String getDescription() {
        return description;
    }

    public void updateDayOfWeek(NumberOfDay numberOfDay) {
    }
}
