package assignment05.domain;

import assignment05.Services.Implement.MediaPlayer;

/**
 * Created by aubrey on 02/04/2017.
 */
public class AudioPlayer implements MediaPlayer {

    MediaAdpter mediaAdpter;

    private String audioType;
    private String fileName;

    public AudioPlayer(){}
    public AudioPlayer(String audioType, String fileName){
        this.audioType = audioType;
        this.fileName = fileName;
    }
    public String play(){
        if(audioType.equalsIgnoreCase("mp3")){
            System.out.println("Playing mp3 file. Name: " + fileName);
        }
        else if(audioType.equalsIgnoreCase("vlc") || audioType.equalsIgnoreCase("mediaclassicplayer")){
            mediaAdpter = new MediaAdpter();
        }
        else
        {
            System.out.println("Invalid media " + audioType + " file format not supported");
        }
        return null;
    }
}
