import java.util.Scanner;

public class TwoDConverter extends Converter {

    public TwoDConverter(double area){
        areaFt = area * 10.7639;
        areaIn = area * 1550;
    }

    public void getAreaConverted(){
        Scanner scanner = new Scanner(System.in);
        String c = "";
        System.out.print("Enter IN or FT to convert it to Inches or Feet respectively: ");
        c = scanner.next().trim().toLowerCase();

        if(c.equals("in")) {
            System.out.printf("\n%s%.2f\n\n", "Area in Inch² is ", areaIn);
        } else if(c.equals("ft")) {
            System.out.printf("\n%s%.2f\n\n", "Area in Feet² is ", areaFt);
        }

    }
}
