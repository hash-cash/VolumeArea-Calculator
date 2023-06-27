import java.lang.Math;

public class Parallelogram extends Shape{
    private double sidea, sideb, angle;

    public Parallelogram(double sa, double sb, double ag){
        sidea = sa;
        sideb = sb;
        angle = ag;
        double radians = Math.toRadians(angle);
        area = sidea * sideb * Math.sin(radians);
    }
    public void printCalculation(){
        System.out.println("\nArea = " + sidea + " x " + sideb + " x sin(" + angle + ") = " + String.format("%.2f", printArea()) + "m²\n");
    }
}
