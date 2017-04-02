package assignment05.Service;

/**
 * Created by aubrey on 02/04/2017.
 */
import assignment05.domain.Cake;
import assignment05.domain.Veg;
public class ImplementShoping implements ShoppingCartVisitor {

    public double visit(Cake cake) {
        double cost = 0;
        if (cake.getPrice() > 50) {
            cost = cake.getPrice() - 5;
        } else {
            cost = cake.getPrice();
            System.out.println("Cake ID: " + cake.getCakeID() + " Cake Cost: R" + cost);

        }
        return cost;
    }

        public double visit(Veg veg){
        double cost = veg.getPricePerKg() * veg.getWeight();
        System.out.println(veg.getFrName()+" cost R"+cost);

        return cost;
    }

}
