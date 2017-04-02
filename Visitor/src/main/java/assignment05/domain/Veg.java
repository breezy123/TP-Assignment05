package assignment05.domain;

import assignment05.Service.ItemElement;
import assignment05.Service.ShoppingCartVisitor;

/**
 * Created by aubrey on 02/04/2017.
 */
public class Veg implements ItemElement {

    private double pricePerKg;
    private double weight;
    private String frName;

    public Veg(){}
    public Veg(int pricePerKg, double weight,String frName){
        this.pricePerKg = pricePerKg;
        this.weight = weight;
        this.frName = frName;
    }
    public double getPricePerKg(){
        return this.pricePerKg;
    }
    public double getWeight(){
        return this.weight;
    }
    public String getFrName(){
        return this.frName;
    }
    public double accept(ShoppingCartVisitor visitor){
        return visitor.visit(this);
    }
}
