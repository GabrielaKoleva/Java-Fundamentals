import java.util.Scanner;

public class specialNumbers_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        for (int i = 1; i <= number; i++) {
            int digitSum = 0;

            int currentNumber = i;
            while (currentNumber > 0){
                digitSum += currentNumber % 10;
                currentNumber = currentNumber / 10;
            }

            boolean isSpacial = (digitSum == 5) ||
                    (digitSum == 7) || (digitSum == 11);

            if (isSpacial){
                System.out.println(i + " -> True");
            }else {
                System.out.println(i + " -> False");
            }
        }

    }
}
