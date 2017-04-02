package assignment05.domain;

/**
 * Created by aubrey on 02/04/2017.
 */
public class MedicineHandler2 extends MedicineHandler {

    public String handleOrder(int order){
        if(order >70 & order <75){
            return "Compral";
        }
        else{
            return medicineOrder.handleOrder(order);
        }
    }
}
