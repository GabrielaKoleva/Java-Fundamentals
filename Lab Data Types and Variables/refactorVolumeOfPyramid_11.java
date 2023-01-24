import java.util.Scanner;

public class refactorVolumeOfPyramid_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double length, width, height = 0;

        System.out.print("Length: ");
        length = Double.parseDouble(scan.nextLine());

        System.out.print("Width: ");
        width = Double.parseDouble(scan.nextLine());

        System.out.print("Height: ");
        height = Double.parseDouble(scan.nextLine());

        height = ((length * width) * height) / 3;
        System.out.printf("Pyramid Volume: %.2f", height);


    }
}
