package section_5.methods.megabytes_converter_excersise;

public class Parameter {

    private int kiloBytes;

    public Parameter(int kiloBytes) {
        this.kiloBytes = kiloBytes;
    }

    public Parameter() {
    }

    public int getKiloBytes(){
        return this.kiloBytes;
    }

    public void setKiloBytes(int kiloBytes){
        this.kiloBytes=kiloBytes;
    }

    @Override
    public String toString() {
        return "Parameter{" +
                "kiloBytes=" + kiloBytes +
                '}';
    }
}
