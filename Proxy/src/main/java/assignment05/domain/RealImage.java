package assignment05.domain;

/**
 * Created by aubrey on 02/04/2017.
 */
import assignment05.Service.Implements.Image;
public class RealImage implements Image{

    private String fileName;

    public RealImage(){}
    public RealImage(String fileName){
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    //@Override
    public String display() {
      return fileName;

    }

    private void loadFromDisk(String fileName){
        System.out.println("Loading " + fileName);
    }
}
