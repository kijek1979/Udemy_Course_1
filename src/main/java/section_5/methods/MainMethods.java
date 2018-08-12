package section_5.methods;

public class MainMethods {

    public static void main(String[] args) {

//        int a = 34;
//        int b = 54;


//        System.out.println(addTwoNumbers(a, b));
//        subTwoNumbers(a, b);

        int score = 10;
        String name = "jarek";

        int playerPositionOnHighScoreTable = calculateHighScorePosition(score);
        displayHighScorePosition(name, playerPositionOnHighScoreTable);


    }

//    public static int addTwoNumbers(int a, int b){
//        return a+b;
//    }
//
//    public static void subTwoNumbers (int a, int b){
//        System.out.println(a-b);
//    }

    public static  void displayHighScorePosition(String playerName, int playerPosition){
        System.out.println(playerName+" managed to get position "+ playerPosition+" on the high score table");
    }

    public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }else if(playerScore > 500 && playerScore <= 1000){
            return 2;
        }else if (playerScore > 100 && playerScore <= 500){
            return 3;
        }
        return 4;
    }
}
