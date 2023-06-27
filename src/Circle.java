public class Circle extends Shape {
    private double radius;
    final double pi = 3.14;
    
    public Circle(double rd){
        radius = rd;
        area = pi*radius*radius;
    }
    public void printCalculation(){
        System.out.println("\nArea = π x " + "( " + radius + " )² = " + String.format("%.2f", printArea()) + "m²\n");
    }
}
