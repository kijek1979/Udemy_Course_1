package section_6_oop_part_1;

public class Car {

    private String model;
    private String brand;
    private int year;


    public void setBrand(String brand){
        String validName = brand.toLowerCase();
        if (validName.equals("porsche") || validName.equals("toyota"))
        this.brand = brand;
        else {
            this.brand = "please set up correct name of brand: porsche or toyota";
        }
    }

    public String getBrand(){
        return this.brand;
    }
}
