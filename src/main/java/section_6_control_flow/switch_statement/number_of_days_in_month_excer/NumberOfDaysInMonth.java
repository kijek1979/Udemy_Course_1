package section_6_control_flow.switch_statement.number_of_days_in_month_excer;

public class NumberOfDaysInMonth implements YearParameter {

    public boolean isLeapYear(int year) throws ScopeOfYearParameterException {

        if (year >= 1 && year <= 9999) {


            if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                return true;

            } else {
                return false;
            }
        }


        throw new ScopeOfYearParameterException("podany rok nie miesci sie w wymaganym zakresie liczb" +
                "od 1 do 9999");


    }

    public int getDaysInMonth(int month, int year) {
        int numberOfDaysInMonth = 0;
        if (month < 1 || month > 12) {
            return -1;
        } else if (year < 1 || year > 9999) {
            return -1;
        }

        if (isLeapYear(year)) {
            switch (month) {
                case 1:
                    numberOfDaysInMonth = 31;
                    break;
                case 2:
                    numberOfDaysInMonth = 29;
                    break;
                case 3:
                    numberOfDaysInMonth = 31;
                    break;
                case 4:
                    numberOfDaysInMonth = 30;
                    break;
                case 5:
                    numberOfDaysInMonth = 31;
                    break;
                case 6:
                    numberOfDaysInMonth = 30;
                    break;
                case 7:
                    numberOfDaysInMonth = 31;
                    break;
                case 8:
                    numberOfDaysInMonth = 31;
                    break;
                case 9:
                    numberOfDaysInMonth = 30;
                    break;
                case 10:
                    numberOfDaysInMonth = 31;
                    break;
                case 11:
                    numberOfDaysInMonth = 30;
                    break;
                case 12:
                    numberOfDaysInMonth = 31;
                    break;

            }
        } else {

            switch (month) {
                case 1:
                    numberOfDaysInMonth = 31;
                    break;
                case 2:
                    numberOfDaysInMonth = 28;
                    break;
                case 3:
                    numberOfDaysInMonth = 31;
                    break;
                case 4:
                    numberOfDaysInMonth = 30;
                    break;
                case 5:
                    numberOfDaysInMonth = 31;
                    break;
                case 6:
                    numberOfDaysInMonth = 30;
                    break;
                case 7:
                    numberOfDaysInMonth = 31;
                    break;
                case 8:
                    numberOfDaysInMonth = 31;
                    break;
                case 9:
                    numberOfDaysInMonth = 30;
                    break;
                case 10:
                    numberOfDaysInMonth = 31;
                    break;
                case 11:
                    numberOfDaysInMonth = 30;
                    break;
                case 12:
                    numberOfDaysInMonth = 31;
                    break;

            }

        }


        return numberOfDaysInMonth;

    }

    public int getDaysInMonthwithException (int month, int year) throws ScopeOfYearParameterException{
        int numberOfDaysInMonth = 0;
        if (month < 1 || month > 12) {
            throw new ScopeOfYearParameterException("podany numer miesiaca przekaracza dozwolony zakres");
        } else if (year < 1 || year > 9999) {
            throw new ScopeOfYearParameterException("podany numer roku przekaracza dozwolony zakres");
        }

        if (isLeapYear(year)) {
            switch (month) {
                case 1:
                    numberOfDaysInMonth = 31;
                    break;
                case 2:
                    numberOfDaysInMonth = 29;
                    break;
                case 3:
                    numberOfDaysInMonth = 31;
                    break;
                case 4:
                    numberOfDaysInMonth = 30;
                    break;
                case 5:
                    numberOfDaysInMonth = 31;
                    break;
                case 6:
                    numberOfDaysInMonth = 30;
                    break;
                case 7:
                    numberOfDaysInMonth = 31;
                    break;
                case 8:
                    numberOfDaysInMonth = 31;
                    break;
                case 9:
                    numberOfDaysInMonth = 30;
                    break;
                case 10:
                    numberOfDaysInMonth = 31;
                    break;
                case 11:
                    numberOfDaysInMonth = 30;
                    break;
                case 12:
                    numberOfDaysInMonth = 31;
                    break;

            }
        } else {

            switch (month) {
                case 1:
                    numberOfDaysInMonth = 31;
                    break;
                case 2:
                    numberOfDaysInMonth = 28;
                    break;
                case 3:
                    numberOfDaysInMonth = 31;
                    break;
                case 4:
                    numberOfDaysInMonth = 30;
                    break;
                case 5:
                    numberOfDaysInMonth = 31;
                    break;
                case 6:
                    numberOfDaysInMonth = 30;
                    break;
                case 7:
                    numberOfDaysInMonth = 31;
                    break;
                case 8:
                    numberOfDaysInMonth = 31;
                    break;
                case 9:
                    numberOfDaysInMonth = 30;
                    break;
                case 10:
                    numberOfDaysInMonth = 31;
                    break;
                case 11:
                    numberOfDaysInMonth = 30;
                    break;
                case 12:
                    numberOfDaysInMonth = 31;
                    break;

            }

        }


        return numberOfDaysInMonth;

    }

    public static void main(String[] args) {

        NumberOfDaysInMonth numberOfDaysInMonth = new NumberOfDaysInMonth();

        System.out.println(numberOfDaysInMonth.getDaysInMonthwithException(0,450100));

    }
}
