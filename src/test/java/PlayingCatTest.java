import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import section_5.methods_overloading.playing_cat_excer.PlayingCat;

public class PlayingCatTest {

    private PlayingCat playingCat;
    @Before
    public void createPlayingCat(){
         playingCat = new PlayingCat();
    }

    @Test
    public void isPlayingCatMethodWorking(){
        Assert.assertTrue(playingCat.isCatPlaying());
    }
}
