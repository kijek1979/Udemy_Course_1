package section_6_control_flow.switch_statement;

public class SwithChallenge1 {

    public char[] chars = {'E'};

    public char[] switchMethod() {

        char[] chars2 = new char[1];

        switch (chars[0]) {
            case 'A':
                chars2[0]='A';
                return chars2;
            case 'B':
                chars2[0]='B';
                return chars2;
            case 'C':
                chars2[0]='C';
                return chars2;
            case 'D':
                chars2[0]='D';
                return chars2;
            default:
                System.out.println("its not A or B or C or D letter");
                chars2[0]= 'X';

        }
        return chars2;
    }

    public static void main(String[] args) {
        SwithChallenge1 swithChallenge1 = new SwithChallenge1();

        System.out.println(swithChallenge1.switchMethod());
    }
}
