import com.sun.jdi.Value;

import java.util.Scanner;

public class beerKegs_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        double maxVolumeOfKeg = -1.0;
        String currentKeg = "";
        for (int i = 0; i < number; i++) {
            String modelOfKeg = scan.nextLine();
            double radiusOfKeg = Double.parseDouble(scan.nextLine());
            int heightOfKeg = Integer.parseInt(scan.nextLine());

            double volumeOfKeg = Math.PI * Math.pow(radiusOfKeg, 2) * heightOfKeg;

            if (volumeOfKeg > maxVolumeOfKeg) {
                maxVolumeOfKeg = volumeOfKeg;
                currentKeg = modelOfKeg;
            }

        }
        System.out.println(currentKeg);
    }
}
