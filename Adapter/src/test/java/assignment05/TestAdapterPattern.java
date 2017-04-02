package assignment05;

/**
 * Created by aubrey on 02/04/2017.
 */
import assignment05.domain.AudioPlayer;
import assignment05.domain.MediaClassicPlay;
import assignment05.domain.VlcPlayers;
import junit.framework.Assert;
import junit.framework.TestCase;

public class TestAdapterPattern extends TestCase{

    AudioPlayer audio = new AudioPlayer();

    VlcPlayers player = new VlcPlayers("mp3");
    MediaClassicPlay classic = new MediaClassicPlay("mp4");

    public void testVlc(){
        System.out.println(player.toString());
        Assert.assertEquals(player.playVlc(),"Playing vlc file. Name: mp3");
    }
    public void testMediaclassic(){
        System.out.println(classic.toString());
        Assert.assertEquals(player.playVlc(),"Playing vlc file. Name: mp3");
    }
}
