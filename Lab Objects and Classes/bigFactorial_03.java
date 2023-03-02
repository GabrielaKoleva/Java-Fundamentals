import java.math.BigInteger;
import java.util.Scanner;

public class bigFactorial_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        BigInteger factorial = new BigInteger(String.valueOf(1));

        for (int i = 1; i <= number; i++) {

            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        System.out.println(factorial);
    }
}
