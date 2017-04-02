package assignment05.domain;

import assignment05.Service.Strategy;

/**
 * Created by aubrey on 02/04/2017.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public int executeStrategy(int num1, int num2 ){
        return strategy.doOperation(num1,num2);
    }
}
