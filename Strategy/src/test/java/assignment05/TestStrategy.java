package assignment05;

/**
 * Created by aubrey on 02/04/2017.
 */
import assignment05.domain.Context;
import assignment05.domain.OperationAdd;
import assignment05.domain.OperationMultiply;
import assignment05.domain.OperationSubtract;
import junit.framework.Assert;
import junit.framework.TestCase;
public class TestStrategy extends TestCase {

    Context context = new Context(new OperationAdd());
    Context context1 = new Context(new OperationSubtract());
    Context context2 = new Context(new OperationMultiply());

    public void testStrategyAdd(){

        System.out.println("14 + 26 = " + context.executeStrategy(14,26));
        Assert.assertEquals(context.executeStrategy(14,26),40);
    }
    public void testStrategySubtract(){
        System.out.println("87 - 13 = " + context1.executeStrategy(87,13));
        Assert.assertEquals(context1.executeStrategy(87,13),74);
    }
    public void testStrategyMultiply(){
        System.out.println("55 x 7 = " + context2.executeStrategy(55,7));
        Assert.assertEquals(context2.executeStrategy(55,7),385);
    }
}
