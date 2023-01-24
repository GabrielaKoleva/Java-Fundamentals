import java.util.Scanner;

public class sumOfOddNumbers_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int sum = 0;

        for (int i = 1; i <= number * 2; i+=2) {
            sum += i;
            System.out.println(i);

        }
        System.out.println("Sum: " + sum);
    }
}
