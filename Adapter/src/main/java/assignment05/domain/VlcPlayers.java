package assignment05.domain;

        import assignment05.Services.Implement.AdvancedMediaPlayer;

/**
 * Created by aubrey on 02/04/2017.
 */
public class VlcPlayers  implements AdvancedMediaPlayer {

    private String fileName;
    public VlcPlayers(){}

    public VlcPlayers(String fileName){
        this.fileName = fileName;
    }
    public String playVlc(){
       return"Playing vlc file. Name: "+ fileName;
    }
    public String playMediaClassic(){
        return "";
    }
}
