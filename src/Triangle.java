public class Triangle extends Shape {
    private double base, height;

    public Triangle(double bs, double ht){
        base = bs;
        height = ht;
        area = 0.5*base*height;
    }
    public void printCalculation(){
        System.out.println("\nArea = 0.5 x " + base + " x " + height + " = " + String.format("%.2f", printArea()) + "m²\n");
    }
}
