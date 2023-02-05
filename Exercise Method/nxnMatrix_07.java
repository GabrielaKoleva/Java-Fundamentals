import java.util.Scanner;

public class nxnMatrix_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        printNxnMatrix(n);
    }

    private static void printNxnMatrix(int number) {
        for (int row = 1; row <= number; row++) {
            for (int column = 1; column <= number; column++) {
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }
}
