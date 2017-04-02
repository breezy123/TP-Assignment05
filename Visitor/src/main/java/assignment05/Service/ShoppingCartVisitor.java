package assignment05.Service;

import assignment05.domain.Cake;
import assignment05.domain.Veg;
/**
 * Created by aubrey on 02/04/2017.
 */
public interface ShoppingCartVisitor {
    double visit(Cake cake);
    double visit(Veg veg);


}
