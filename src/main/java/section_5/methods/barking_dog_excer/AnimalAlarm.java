package section_5.methods.barking_dog_excer;

public class AnimalAlarm {

    Dog dog = new Dog();


    public boolean bark(boolean barking, int hoursOfTheDay) {
        if (!barking) {
            return false;
        } else {


            if (hoursOfTheDay > 0 && hoursOfTheDay <= 23) {

                if (barking) {

                    dog.animalVoice();

                    if (hoursOfTheDay <= 8 || hoursOfTheDay >= 22) {
                        System.out.println("get up");
                        return true;
                    } else {
                        System.out.println("dont get up");
                        return false;

                    }

                }
            }
        }

        return false;

    }
}
