public class Cylinder extends Shape3D {
    private double radius, height;
    final double pi = 3.14;

    public Cylinder(double r, double ht){
        radius = r;
        height = ht;

        volume = pi * radius * radius * height;
    }
    public void printCalculation(){
        System.out.println("\nVolume = π x " + radius + "² x " + height + " = " + String.format("%.2f", printVolume()) + "m^3\n");
    }
}