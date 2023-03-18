import java.util.Scanner;
public class k {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String bigNumber = scanner.nextLine();
            int singleDigit = scanner.nextInt();

            int[] result = multiply(bigNumber, singleDigit);

            for (int i = 0; i < result.length; i++) {
                System.out.print(result[i]);
            }
        }

        public static int[] multiply(String bigNumber, int singleDigit) {
            int[] result = new int[bigNumber.length() + 1];
            int carry = 0;

            for (int i = bigNumber.length() - 1; i >= 0; i--) {
                int digit = bigNumber.charAt(i) - '0';
                int product = digit * singleDigit + carry;

                result[i + 1] = product % 10;
                carry = product / 10;
            }

            if (carry > 0) {
                result[0] = carry;
            }

            return result;
        }
    }
