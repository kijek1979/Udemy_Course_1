package section_5.methods_overloading.playing_cat_excer;

public class PlayingCat implements PlayingCatParameters {


    public boolean isCatPlaying() {
        if (summer) {
            if (temperature >= 25 && temperature <= 45) {
                return true;
            } else {
                return false;
            }


        } else {
            if (temperature >= 25 && temperature <= 35)
                return true;

        }
        return false;
    }

    public static void main(String[] args) {
        PlayingCat playingCat = new PlayingCat();
        System.out.println(playingCat.isCatPlaying());
    }
}



