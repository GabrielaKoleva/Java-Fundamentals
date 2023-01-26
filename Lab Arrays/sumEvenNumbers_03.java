import java.util.Arrays;
import java.util.Scanner;

public class sumEvenNumbers_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int[] numbers = Arrays
               .stream(scan.nextLine().split(" "))
               .mapToInt(Integer::parseInt).toArray();

       int evenSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0){
                evenSum += numbers[i];
            }
        }
        System.out.println(evenSum);
    }
}
