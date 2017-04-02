package assignment05.domain;

/**
 * Created by aubrey on 02/04/2017.
 */
public abstract class MedicineHandler {

    MedicineHandler medicineOrder;

    public void setMedicineOrder(MedicineHandler medicineOrder){
        this.medicineOrder = medicineOrder;
    }
    public abstract String handleOrder(int order);
}
