package section_5.methods.megabytes_converter_excersise;

public class Method {

    public void printMegaBytesAndKiloBytes(int kilobytes){

        int converter = kilobytes/1000;
        int moduloKilo=(kilobytes-(converter*1000))/8;

        System.out.println(kilobytes+" KB = "+converter+" MB and "+moduloKilo+" KB");

    }


}
