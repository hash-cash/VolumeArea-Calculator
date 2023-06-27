import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) throws Exception {
        System.out.println("\nAREA CALCULATOR\n");
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        while(!choice.equals("exit"))
        {
            System.out.println("\nEnter 2d for 2D Shapes");
            System.out.println("Enter 3d for 3D Shapes");
            System.out.println("Enter exit to quit\n");
            System.out.print("Choice: ");
            choice = scanner.next().trim().toLowerCase();
            if(choice.equals("2d"))
            {
                System.out.println("\nEnter r for Rectangle");
                System.out.println("Enter c for Circle");
                System.out.println("Enter t for Triangle");
                System.out.println("Enter e for Ellipse");
                System.out.println("Enter p for Parallelogram");
                System.out.println("Enter rh for Rhombus");
                System.out.println("Enter tp for Trapezoid");
                System.out.println("Enter o to show options");
                System.out.println("Enter back to return.\n");

                while(!choice.equals("back"))
                {
                    System.out.println("Enter o to show the options");
                    System.out.print("Choice: ");
                    choice = scanner.next().trim().toLowerCase();
                    if(choice.equals("r"))
                    {
                        System.out.print("Enter length: ");
                        double length = scanner.nextDouble();

                        System.out.print("Enter width: ");
                        double width = scanner.nextDouble();

                        Rectangle rec = new Rectangle(length, width);
                        rec.printCalculation();

                        TwoDConverter td = new TwoDConverter(rec.printArea());
                        td.getAreaConverted();
                    }
                    else if (choice.equals("c")) {
                        System.out.print("Enter radius: ");
                        double radius = scanner.nextDouble();

                        Circle circ = new Circle(radius);
                        circ.printCalculation();

                        TwoDConverter td = new TwoDConverter(circ.printArea());
                        td.getAreaConverted();
                    }
                    else if (choice.equals("t")) {
                        System.out.print("Enter base: ");
                        double base = scanner.nextDouble();

                        System.out.print("Enter height: ");
                        double height = scanner.nextDouble();

                        Triangle trg = new Triangle(base, height);
                        trg.printCalculation();

                        TwoDConverter td = new TwoDConverter(trg.printArea());
                        td.getAreaConverted();
                    }
                    else if (choice.equals("e")) {
                        System.out.print("Enter side A: ");
                        double sa = scanner.nextDouble();

                        System.out.print("Enter side B: ");
                        double sb = scanner.nextDouble();

                        Ellipse ell = new Ellipse(sa, sb);
                        ell.printCalculation();

                        TwoDConverter td = new TwoDConverter(ell.printArea());
                        td.getAreaConverted();
                    }
                    else if (choice.equals("p")) {
                        System.out.print("Enter side A: ");
                        double sa = scanner.nextDouble();

                        System.out.print("Enter side B: ");
                        double sb = scanner.nextDouble();

                        System.out.print("Enter angle: ");
                        double agl = scanner.nextDouble();

                        Parallelogram prl = new Parallelogram(sa, sb, agl);
                        prl.printCalculation();

                        TwoDConverter td = new TwoDConverter(prl.printArea());
                        td.getAreaConverted();
                    }
                    else if (choice.equals("rh")) {
                        System.out.print("Enter diagonal A: ");
                        double da = scanner.nextDouble();

                        System.out.print("Enter diagonal B: ");
                        double db = scanner.nextDouble();

                        System.out.print("Enter height: ");
                        double ht = scanner.nextDouble();

                        Rhombus rhm = new Rhombus(da, db, ht);
                        rhm.printCalculation();

                        TwoDConverter td = new TwoDConverter(rhm.printArea());
                        td.getAreaConverted();
                    }
                    else if (choice.equals("tp")) {
                        System.out.print("Enter side A: ");
                        double sa = scanner.nextDouble();

                        System.out.print("Enter side B: ");
                        double sb = scanner.nextDouble();

                        System.out.print("Enter height: ");
                        double ht = scanner.nextDouble();

                        Trapezoid trp = new Trapezoid(sa, sb, ht);
                        trp.printCalculation();

                        TwoDConverter td = new TwoDConverter(trp.printArea());
                        td.getAreaConverted();
                    }
                    else if (choice.equals("o")) {
                        System.out.println("Enter r for Rectangle");
                        System.out.println("Enter c for Circle");
                        System.out.println("Enter t for Triangle");
                        System.out.println("Enter e for Ellipse");
                        System.out.println("Enter p for Parallelogram");
                        System.out.println("Enter rh for Rhombus");
                        System.out.println("Enter tp for Trapezoid");
                        System.out.println("Enter o to show these options");
                        System.out.println("Enter back to return.\n");
                    }
                }
            }
            else if (choice.equals("3d"))
            {
                System.out.println("\nEnter c for Cuboid");
                System.out.println("Enter cy for Cylinder");
                System.out.println("Enter s for Sphere");
                System.out.println("Enter p for Pyramid");
                System.out.println("Enter o to show options");
                System.out.println("Enter back to return.\n");

                while(!choice.equals("back"))
                {
                    System.out.println("Enter o to show the options");
                    System.out.print("Choice: ");
                    choice = scanner.next().trim().toLowerCase();
                    if(choice.equals("c"))
                    {
                        System.out.print("Enter length: ");
                        double ln = scanner.nextDouble();

                        System.out.print("Enter width: ");
                        double wd = scanner.nextDouble();

                        System.out.print("Enter height: ");
                        double ht = scanner.nextDouble();

                        Cuboid cb = new Cuboid(ln, wd, ht);
                        cb.printCalculation();

                        ThreeDConverter td = new ThreeDConverter(cb.printVolume());
                        td.getAreaConverted();
                    }
                    else if (choice.equals("cy")) {
                        System.out.print("Enter radius: ");
                        double rd = scanner.nextDouble();

                        System.out.print("Enter height: ");
                        double ht = scanner.nextDouble();

                        Cylinder cy = new Cylinder(rd, ht);
                        cy.printCalculation();

                        ThreeDConverter td = new ThreeDConverter(cy.printVolume());
                        td.getAreaConverted();
                    }
                    else if (choice.equals("s")) {
                        System.out.print("Enter radius: ");
                        double rd = scanner.nextDouble();

                        Sphere s = new Sphere(rd);
                        s.printCalculation();

                        ThreeDConverter td = new ThreeDConverter(s.printVolume());
                        td.getAreaConverted();
                    }
                    else if (choice.equals("p")) {
                        System.out.print("Enter length: ");
                        double ln = scanner.nextDouble();

                        System.out.print("Enter width: ");
                        double wd = scanner.nextDouble();

                        System.out.print("Enter height: ");
                        double ht = scanner.nextDouble();

                        Pyramid pr = new Pyramid(ln, wd, ht);
                        pr.printCalculation();

                        ThreeDConverter td = new ThreeDConverter(pr.printVolume());
                        td.getAreaConverted();
                    }
                    else if (choice.equals("o")) {
                        System.out.println("Enter c for Cuboid");
                        System.out.println("Enter cy for Cylinder");
                        System.out.println("Enter s for Sphere");
                        System.out.println("Enter p for Pyramid");
                        System.out.println("Enter o to show options");
                        System.out.println("Enter back to return.\n");
                    }
                }
            }
        }

        System.out.println("\nThank you for using our app!\n");

        scanner.close();
    }
}
