import java.util.Scanner;

public class printAndSum_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startNumber = Integer.parseInt(scan.nextLine());
        int endNumber = Integer.parseInt(scan.nextLine());

        int number = 0;

        for (int i = startNumber; i <= endNumber; i++) {
            System.out.print(i);
            System.out.print(" ");
            number += i;
        }
        System.out.println();
        System.out.printf("Sum: %d",number);
    }
}
