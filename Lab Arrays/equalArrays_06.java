import java.util.Arrays;
import java.util.Scanner;

public class equalArrays_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


      int[] firstNumbers = Arrays
              .stream(scan.nextLine().split(" "))
              .mapToInt(Integer::parseInt).toArray();
      int[] secondNumbers = Arrays
              .stream(scan.nextLine().split(" "))
              .mapToInt(Integer::parseInt).toArray();

      int sum = 0;

        for (int i = 0; i < firstNumbers.length; i++) {

            if (firstNumbers[i] != secondNumbers[i]){
                System.out.printf("Arrays are not identical. " +
                        "Found difference at %d index.", i);
                return;
            }
            sum += firstNumbers[i];
        }
        System.out.printf("Arrays are identical. Sum: %d", sum);
    }
}
