package assignment05;

/**
 * Created by aubrey on 02/04/2017.
 */
import assignment05.domain.MedicineHandler1;
import assignment05.domain.MedicineHandler2;
import assignment05.domain.MedicineHandler3;
import junit.framework.TestCase;
import junit.framework.Assert;
import assignment05.domain.MedicineHandler;

public class TestMedicine extends TestCase{

    MedicineHandler medicine1,  medicine2, medicine3;

    public void setUp() throws Exception{

        medicine1 = new MedicineHandler1();
        medicine2 = new MedicineHandler2();
        medicine3 = new MedicineHandler3();
    }

    public void testMedicines() throws Exception{
        medicine1.setMedicineOrder(medicine2);
        medicine2.setMedicineOrder(medicine3);
        medicine3.setMedicineOrder(medicine1);

        Assert.assertEquals(medicine1.handleOrder(72),"Panado");
        Assert.assertEquals(medicine2.handleOrder(73),"Compral");
        Assert.assertEquals(medicine3.handleOrder(77),"Grandpa");
    }
}
