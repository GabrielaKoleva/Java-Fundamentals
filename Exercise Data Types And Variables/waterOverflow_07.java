import java.util.Scanner;

public class waterOverflow_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      int number = Integer.parseInt(scan.nextLine());

      int capacityOfTankInLitters = 255;
      int sumOfQuantitiesOfLitters = 0;

        for (int i = 0; i < number; i++) {
            int currentQuantities = Integer.parseInt(scan.nextLine());

            if (currentQuantities + sumOfQuantitiesOfLitters > capacityOfTankInLitters){
                System.out.println("Insufficient capacity!");
            }else {
                sumOfQuantitiesOfLitters += currentQuantities;
            }
        }
        System.out.println(sumOfQuantitiesOfLitters);

    }
}
