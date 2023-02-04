package method;

import java.util.Scanner;

public class printingTriangle_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scan.nextLine());

        printTriangle(inputNumber);
    }

    public static void printTriangle(int number) {
        for (int index = 1; index <= number; index++) {
            printLine(1, index);
        }
        for (int i = number - 1; i >= 1; i--) {
            printLine(1, i);
        }
    }

    public static void printLine(int start, int end) {

        for (int i = start; i <= end; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
