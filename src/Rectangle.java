public class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double len, double wid){
        length = len;
        width = wid;
        area = length*width;
    }
    public void printCalculation(){
        System.out.println("\nArea = " + length + " x " + width + " = " + String.format("%.2f", printArea()) + "m²\n");
    }
}
