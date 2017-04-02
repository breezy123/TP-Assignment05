package assignment05;

/**
 * Created by aubrey on 31/03/2017.
 */
public class AreaCalculator {
    private static AreaCalculator areaCalculator = null;

    private AreaCalculator(){}

    public static AreaCalculator getAreaCalculator(){
        if(areaCalculator ==null){
            areaCalculator = new AreaCalculator();
        }
        return areaCalculator;
    }
    public double rectangleArea(double length, double weigth){

        return length * weigth;
    }
    public double circleArea(double raduis){

        return 3.14 * (raduis*raduis);
    }

    public double sqaureArea(double length, double height){
        return length * height;
    }
}
