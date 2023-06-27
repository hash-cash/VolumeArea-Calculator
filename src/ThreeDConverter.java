import java.util.Scanner;

public class ThreeDConverter extends Converter {

    public ThreeDConverter(double area){
        areaFt = area * 35.3147;
        areaIn = area * 61023.7;
    }

    public void getAreaConverted(){
        Scanner scanner = new Scanner(System.in);
        String c = "";
        System.out.print("Enter IN or FT to convert it to Inches or Feet respectively: ");
        c = scanner.next().trim().toLowerCase();

        if(c.equals("in")) {
            System.out.printf("\n%s%.2f\n\n", "Volume in Inch^3 is ", areaIn);
        } else if(c.equals("ft")) {
            System.out.printf("\n%s%.2f\n\n", "Volume in Feet^3 is ", areaFt);
        }

    }
}
