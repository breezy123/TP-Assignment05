package assignment05.domain;

/**
 * Created by aubrey on 02/04/2017.
 */
public class MedicineHandler1 extends MedicineHandler{

    public  String handleOrder(int order){
        if(order >70){
            return "Panado";
        }
        else
        {
            return medicineOrder.handleOrder(order);
        }
    }
}
