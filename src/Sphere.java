public class Sphere extends Shape3D{
    private double radius;
    final double pi = 3.14;

    public Sphere(double r){
        radius = r;

        volume = (4.0/3.0) * pi * radius * radius * radius;
    }
    public void printCalculation(){
        System.out.println("\nVolume = 4/3 x π x " + radius + "^3 = " + String.format("%.2f", printVolume()) + "m^3\n");
    }
}
