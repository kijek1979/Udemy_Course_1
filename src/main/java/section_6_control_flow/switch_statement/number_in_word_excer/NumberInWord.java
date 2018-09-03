package section_6_control_flow.switch_statement.number_in_word_excer;

public class NumberInWord implements NumberInWordMethod{

    public String printNumberInWord(double number) throws WrongScopeOfNumberException{
        if (number < 0 || number > 9){
            throw new WrongScopeOfNumberException("podan liczba przekracza dopuszczalny zakres");
        }else {

            String temporaryValue = "";
            switch ((int) number) {

                case 0:
                    temporaryValue = "ZERO";
                    break;
                case 1:
                    temporaryValue = "ONE";
                    break;
                case 2:
                    temporaryValue = "TWO";
                    break;
                case 3:
                    temporaryValue = "THREE";
                    break;
                case 4:
                    temporaryValue = "FOUR";
                    break;
                case 5:
                    temporaryValue = "FIVE";
                    break;
                case 6:
                    temporaryValue = "SIX";
                    break;
                case 7:
                    temporaryValue = "SEVEN";
                    break;
                case 8:
                    temporaryValue = "EIGHT";
                    break;
                case 9:
                    temporaryValue = "NINE";
                    break;

            }

            return temporaryValue;
        }
    }
}
