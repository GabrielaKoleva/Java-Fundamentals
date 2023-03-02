import java.math.BigDecimal;
import java.util.Scanner;

public class sumBigNumbers_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        BigDecimal firstNumber = new BigDecimal(scan.nextLine());
        BigDecimal secondNumber = new BigDecimal(scan.nextLine());

        BigDecimal sum = firstNumber.add(secondNumber);

        System.out.println(sum);
    }
}
