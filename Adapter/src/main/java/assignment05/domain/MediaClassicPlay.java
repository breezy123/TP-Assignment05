package assignment05.domain;

import assignment05.Services.Implement.AdvancedMediaPlayer;

/**
 * Created by aubrey on 02/04/2017.
 */
public class MediaClassicPlay implements AdvancedMediaPlayer{

    private String fileName;

    public MediaClassicPlay(){}
    public MediaClassicPlay(String fileName){
        this.fileName = fileName;
    }

    public String playMediaClassic(){
        return "Playing MediaClassic File. Name: "+fileName;
    }
    public String playVlc(){
       return "";
    }
}
