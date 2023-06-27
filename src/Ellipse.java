public class Ellipse extends Shape{
    private double sidea, sideb;
    final double pi = 3.14;

    public Ellipse(double sa, double sb){
        sidea = sa;
        sideb = sb;
        area = pi * sidea * sideb;
    }
    public void printCalculation(){
        System.out.println("\nArea = π x " + sidea + " x " + sideb + " = " + String.format("%.2f", printArea()) + "m²\n");
    }
}
