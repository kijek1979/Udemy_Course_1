package section_5.methods_overloading.area_calculator_excer;

public class CalculateRectangleArea implements Calculating {

    private Parameters parameters;

    public Parameters getParameters() {
        return parameters;
    }

    public void setParameters(Parameters parameters) {
        this.parameters = parameters;
    }

    public double calculateAreas() throws IllegalArgumentException {
        if((parameters.getaSideOfRectangle() <= 0) ){
            throw  new IllegalArgumentException("bok A ma wartośc ponizej zera");

        }else if(parameters.getbSideOfRectangle() < 0){
            throw new IllegalArgumentException("bok B ma wartość ponizej zera");

        }else if((parameters.getaSideOfRectangle() == 0) || (parameters.getbSideOfRectangle() == 0)){
            throw new IllegalArgumentException("wartość toregośz boków jest = 0");
        }

        return parameters.getbSideOfRectangle()*parameters.getaSideOfRectangle();
    }
}
