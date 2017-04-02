package assignment05.domain;

import assignment05.Service.ItemElement;
import assignment05.Service.ShoppingCartVisitor;

/**
 * Created by aubrey on 02/04/2017.
 */
public class Cake implements ItemElement {

    private double price;
    private String cakeID;

    public Cake(){}
    public Cake(double price,String cakeID){
        this.price = price;
        this.cakeID = cakeID;
    }

    public double getPrice(){
        return this.price;
    }
    public String getCakeID(){
        return this.cakeID;
    }
    public double accept(ShoppingCartVisitor visitor){
        return visitor.visit(this);
    }

}
