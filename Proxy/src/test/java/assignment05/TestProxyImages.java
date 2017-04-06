package assignment05;

/**
 * Created by aubrey on 02/04/2017.
 */

import assignment05.domain.ProxyImage;
import junit.framework.Assert;
import junit.framework.TestCase;
public class TestProxyImages extends TestCase{

    //Image image = new ProxyImage("car.jpg");

    ProxyImage pro = new ProxyImage("car.jpg");

    public void testImageProxy(){
        pro.display();
        Assert.assertEquals(pro.display(),"car.jpg");
    }

}
