import java.util.Scanner;

public class refactorSpecialNumbers_12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int count = Integer.parseInt(scan.nextLine());
        int sumDigit = 0;

        int sum = 0;
        boolean isSpecialNumber = false;
        for (int i = 1; i <= count; i++) {
            sum = i;
            while (i > 0) {
                sumDigit += i % 10;
                i = i / 10;
            }
            isSpecialNumber = (sumDigit == 5) || (sumDigit == 7) || (sumDigit == 11);
            //System.out.printf("%d -> %b%n", sum, isSpecialNumber);
            if (isSpecialNumber){
                System.out.printf("%d -> True%n", sum);
            }else {
                System.out.printf("%d -> False%n", sum);
            }
            sumDigit = 0;
            i = sum;
        }


    }
}
