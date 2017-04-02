package assignment05.domain;

/**
 * Created by aubrey on 02/04/2017.
 */
public class MedicineHandler3 extends MedicineHandler{

    public String handleOrder(int order){

        if(order >75 & order <80){
            return "Grandpa";
        }
        else
        {
            return medicineOrder.handleOrder(order);
        }
    }
}
