import java.lang.Math;
import java.util.Scanner;

public class AreaCalc {
    public double calculateAreaOfSqare(double a) {
        double areaS = a * a;
        System.out.println("The area for Square is " + areaS);
        return areaS;
    }

    public double calculateAreaOfCircle(double r) {
        double areaC = Math.PI * r * r;
        System.out.println("The are for Circle is " + areaC);
        return areaC;
    }

    public double calculateAreaOfRectangle(double length, double breadth) {
        double areaR = length * breadth;
        System.out.println("Area of Rectangular is " + areaR);
        return areaR;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of side ");
        double a = sc.nextDouble();
        System.out.print("Enter the value of radius ");
        double b = sc.nextDouble();
        System.out.print("Enter the length of rectangle ");
        double c = sc.nextDouble();
        System.out.print("Enter the breadth of rectangle ");
        double d = sc.nextDouble();
        AreaCalc obj = new AreaCalc();
        obj.calculateAreaOfSqare(a);
        obj.calculateAreaOfCircle(b);
        obj.calculateAreaOfRectangle(c, d);
    }
}
