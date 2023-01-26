import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class evenAndOddSubtraction_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int[] numbers = Arrays
               .stream(scan.nextLine().split(" "))
               .mapToInt(Integer::parseInt).toArray();

       int evenSum = 0;
       int oddSum = 0;

        for (int currentNumber : numbers) {

            if (currentNumber % 2 == 0){
                evenSum += currentNumber;
            }else {
                oddSum += currentNumber;
            }
        }
        System.out.println(evenSum - oddSum);
    }
}
