public class Trapezoid extends Shape{
    private double sidea, sideb, height;

    public Trapezoid(double sa, double sb, double ht){
        sidea = sa;
        sideb = sb;
        height = ht;
        area = (sidea + sideb) * height * 0.5;
    }
    public void printCalculation(){
        System.out.println("\nArea = (" + sidea + " + " + sideb + ") x " + height + "/2 = " + String.format("%.2f", printArea()) + "m²\n");
    }
}
