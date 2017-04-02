package assignment05;

/**
 * Created by aubrey on 02/04/2017.
 */
import assignment05.Service.ItemElement;
import assignment05.domain.Cake;
import assignment05.domain.Veg;
import junit.framework.Assert;
import junit.framework.TestCase;
public class TestVisitor extends TestCase{

    ItemElement item;

    public void testCakeVisitor(){

        Cake cake = new Cake(58.43,"CKE9383");
        Assert.assertEquals(cake.getCakeID(),"CKE9383");
        Assert.assertEquals(cake.getPrice(),58.43);
    }

    public void testVegVisitor(){
        Veg veg = new Veg(125,45.2,"Butternut");
        Assert.assertEquals(veg.getFrName(),"Butternut");
        Assert.assertEquals(veg.getWeight(),45.2);
        Assert.assertEquals(veg.getPricePerKg(),125.0);
    }
}
