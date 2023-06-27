public class Cuboid extends Shape3D {
    private double length, width, height;

    public Cuboid(double ln, double wd, double ht){
        length = ln;
        width = wd;
        height = ht;

        volume = length * width * height;
    }
    public void printCalculation(){
        System.out.println("\nVolume = " + length + " x " + width + " x " + height + " = " + String.format("%.2f", printVolume()) + "m^3\n");
    }
}
