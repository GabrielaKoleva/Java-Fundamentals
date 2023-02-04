package method;

import java.io.PrintStream;
import java.util.Scanner;

public class calculateRectangleArea_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double widthInput = Double.parseDouble(scan.nextLine());
        double lengthInput = Double.parseDouble(scan.nextLine());

        double area = getAreaRectangle(widthInput, lengthInput);

        System.out.printf("%.0f",area);
    }

    public static double getAreaRectangle(double width, double length) {
        return width * length;
    }
}
