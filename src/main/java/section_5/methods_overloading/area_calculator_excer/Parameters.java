package section_5.methods_overloading.area_calculator_excer;

public class Parameters {

    private double radius;
    private double aSideOfRectangle;
    private double bSideOfRectangle;

    public Parameters(double radius) {
        this.radius = radius;
    }

    public Parameters(double aSideOfRectangle, double bSideOfRectangle) {
        this.aSideOfRectangle = aSideOfRectangle;
        this.bSideOfRectangle = bSideOfRectangle;
    }

    public Parameters() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getaSideOfRectangle() {
        return aSideOfRectangle;
    }

    public void setaSideOfRectangle(double aSideOfRectangle) {
        this.aSideOfRectangle = aSideOfRectangle;
    }

    public double getbSideOfRectangle() {
        return bSideOfRectangle;
    }

    public void setbSideOfRectangle(double bSideOfRectangle) {
        this.bSideOfRectangle = bSideOfRectangle;
    }
}
