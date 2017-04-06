package assignment05.domain;

import assignment05.Services.Implement.AdvancedMediaPlayer;
import assignment05.Services.Implement.MediaPlayer;

/**
 * Created by aubrey on 02/04/2017.
 */
public class MediaAdpter  implements MediaPlayer{

    private String audioType;
    private String fileName;

    //public MediaAdpter(){}
    public MediaAdpter(String audioType, String fileName){
        this.audioType = audioType;
        this.fileName = fileName;
    }
    AdvancedMediaPlayer advancedMusicPlay;

    public MediaAdpter(){
        if(audioType.equalsIgnoreCase("vlc") ){
            advancedMusicPlay = new VlcPlayers();

        }else if (audioType.equalsIgnoreCase("mediaclassicplayer")){
            advancedMusicPlay = new MediaClassicPlay();
        }
    }
    public String play(){
        if(audioType.equalsIgnoreCase("vlc")){
            advancedMusicPlay.playVlc();
        }
        else if(audioType.equalsIgnoreCase("mediaclassicplayer")){
            advancedMusicPlay.playMediaClassic();
        }
        return null;
    }
}
