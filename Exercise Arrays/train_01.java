import java.util.Arrays;
import java.util.Scanner;

public class train_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int counterWagons = Integer.parseInt(scan.nextLine());

        int[] peopleInWagons = new int[counterWagons];

        for (int i = 0; i < peopleInWagons.length; i++) {
            peopleInWagons[i] = Integer.parseInt(scan.nextLine());
        }

        int sum = 0;

        for (int peopleInTrain : peopleInWagons) {
            System.out.print(peopleInTrain + " ");
            sum += peopleInTrain;
        }
        System.out.println();
        System.out.println(sum);
    }
}
