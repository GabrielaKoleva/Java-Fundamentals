import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       String[] inputArray = scan.nextLine().split(" ");

        for (int i = 0; i < inputArray.length / 2; i++) {
            String currentElement = inputArray[i];
            inputArray[i] = inputArray[inputArray.length - 1 - i];

            inputArray[inputArray.length - 1 - i] = currentElement;
        }
        System.out.println(String.join(" ", inputArray));
    }
}
