package assignment05.domain;

import assignment05.Service.Implements.Image;

/**
 * Created by aubrey on 02/04/2017.
 */
public class ProxyImage implements Image {

    private RealImage realImage;
    private String fileName;

    public ProxyImage(){}
    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    //@Override
    public String display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
     return realImage.display();
    }
}
