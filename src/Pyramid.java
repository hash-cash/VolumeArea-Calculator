public class Pyramid extends Shape3D {
    private double length, width, height;

    public Pyramid(double ln, double wd, double ht){
        length = ln;
        width = wd;
        height = ht;

        volume = 1.0/3.0 * length * width * height;
    }
    public void printCalculation(){
        System.out.println("\nVolume = 1/3 x " + length + " x " + width + " x " + height + " = " + String.format("%.2f", printVolume()) + "m^3\n");
    }
}
