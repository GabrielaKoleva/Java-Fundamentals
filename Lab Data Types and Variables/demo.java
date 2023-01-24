import java.math.BigDecimal;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= number; i++) {
            int currentNumber = i;

            int sum = 0;

            while (currentNumber > 0) {

                sum += currentNumber % 10;
                currentNumber = currentNumber / 10;
            }

            boolean isSpecialNum = sum == 5 || sum == 7 || sum == 11;
            if (isSpecialNum){
                System.out.printf("%d -> True%n", i);
            }else {
                System.out.printf("%d -> False%n", i);
            }
        }


    }
}
