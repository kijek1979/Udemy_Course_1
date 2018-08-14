package section_5.methods.barking_dog_excer;

public abstract class Animal {

    private String animal;

    public Animal(String animal) {
        this.animal = animal;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public Animal() {
    }

    public abstract void animalVoice();

}
