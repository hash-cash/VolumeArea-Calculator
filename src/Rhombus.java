public class Rhombus extends Shape {
    private double diag1, diag2, height;

    public Rhombus(double d1, double d2, double ht){
        diag1 = d1;
        diag2 = d2;
        height = ht;
        area = (diag1 * diag2) / height;
    }
    public void printCalculation(){
        System.out.println("\nArea = (" + diag1 + " x " + diag2 + ") / " + height + " = " +String.format("%.2f", printArea()) + "m²\n");
    }
}
