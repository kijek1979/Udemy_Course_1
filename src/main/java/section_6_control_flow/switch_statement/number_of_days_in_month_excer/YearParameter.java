package section_6_control_flow.switch_statement.number_of_days_in_month_excer;

public interface YearParameter {

    int year = 1600;

    boolean isLeapYear(int year) throws ScopeOfYearParameterException;
}
