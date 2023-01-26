import java.util.Arrays;
import java.util.Scanner;

public class commonElements_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] firstInput = scan.nextLine().split(" ");
        String[] secondInput = scan.nextLine().split(" ");

        for (String elementsOne : secondInput) {
            for (String elementsTwo : firstInput) {
             if (elementsOne.equals(elementsTwo)){
                 System.out.print(elementsOne + " ");
             }

            }
        }
    }
}
