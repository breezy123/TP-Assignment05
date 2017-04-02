package assignment05.domain;

import assignment05.Service.Strategy;

/**
 * Created by aubrey on 02/04/2017.
 */
public class OperationAdd implements Strategy {

    public int doOperation(int num1, int num2){
        return num1+num2;
    }
}
