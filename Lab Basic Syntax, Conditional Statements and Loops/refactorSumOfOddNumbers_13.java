import java.util.Scanner;

public class refactorSumOfOddNumbers_13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {

            System.out.println(2 * i + 1);
            sum += i * 2 + 1;
        }
        System.out.printf("Sum: %d%n", sum);

    }
}
