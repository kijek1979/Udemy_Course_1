package section_6_control_flow.switch_statement.day_of_week_challenge;

import java.util.HashSet;
import java.util.Set;

public class NumberOfDay implements Observable {

    private int numberOfDay;
    private DaysOfWeek daysOfWeek;
    private Set<Observer> registeredObservers = new HashSet<Observer>();

    public NumberOfDay(int numberOfDay) {
        switch (numberOfDay) {
            case 1:
               this.daysOfWeek = DaysOfWeek.MONDAY;
                break;
            case 2:
                this.daysOfWeek = DaysOfWeek.TUESDAY;
                break;
            case 3:
                this.daysOfWeek = DaysOfWeek.WEDNSDAY;
                break;
            case 4:
                this.daysOfWeek = DaysOfWeek.THURSDAY;
                break;
            case 5:
                this.daysOfWeek = DaysOfWeek.FRIDAY;
                break;
            case 6:
                this.daysOfWeek = DaysOfWeek.SATURDAY;
                break;
            case 7:
                this.daysOfWeek = DaysOfWeek.SUNDAY;
                break;
        }

        this.numberOfDay = numberOfDay;
    }

    public int getNumberOfDay() {
        return numberOfDay;
    }

    public void setNumberOfDay(int numberOfDay) {
        this.numberOfDay = numberOfDay;
    }

    public DaysOfWeek getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(DaysOfWeek daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }

    @Override
    public String toString() {
        return "NumberOfDay{" +
                "numberOfDay=" + numberOfDay +
                ", daysOfWeek=" + daysOfWeek +
                '}';
    }


    public void registerObsrver(Observer observer) {
        registeredObservers.add(observer);


    }

    public  void unregisterObserver(Observer observer) {
        registeredObservers.remove(observer);


    }

    public void notifyObserver() {
        for (Observer o: registeredObservers
             ) {
            o.updateDayOfWeek(this);
        }
    }

    public void changeOrderStatus(DaysOfWeek daysOfWeek){
        setDaysOfWeek(daysOfWeek);
        notifyObserver();
    }
}
