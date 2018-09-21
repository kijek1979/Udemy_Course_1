package section_6_control_flow.parsing;

import section_6_control_flow.parsing.flour_pack_excer.Counts;
import section_6_control_flow.parsing.flour_pack_excer.Packs;

public class MainParsing {

    public static void main(String[] args) {


//        String numberAsString = "2018";
//        int numberFromString = Integer.valueOf(numberAsString);
//
//        System.out.println(numberFromString);
//
//        int numberParsedFromString = Integer.parseInt(numberAsString);
//
//        System.out.println(numberParsedFromString);
//
//        System.out.println(numberAsString+1);

        Counts counts = new Counts(12);
        Packs packs = new Packs();
        System.out.println(packs.canPack(counts, -2, 2));
    }
}
