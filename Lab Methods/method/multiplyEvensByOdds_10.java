package method;

import java.util.Scanner;

public class multiplyEvensByOdds_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scan.nextLine());

        int sumEven = getEvenNumber(Math.abs(inputNumber));
        int oddSum = getOddNumber(Math.abs(inputNumber));

        int total = sumEven * oddSum;

        System.out.println(total);

    }

    public static int getEvenNumber(int inputNumber) {

        int sumOfEven = 0;
        int sumOfOdd = 0;

        while (inputNumber > 0) {
            int num = inputNumber % 10;
            if (num % 2 == 0) {
                sumOfEven += num;
            } else {
                sumOfOdd += num;
            }
            inputNumber = inputNumber / 10;
        }
        return sumOfEven;
    }

    public static int getOddNumber(int inputNumber) {
        int sumOfEven = 0;
        int sumOfOdd = 0;

        while (inputNumber > 0) {
            int num = inputNumber % 10;
            if (num % 2 == 0) {
                sumOfEven += num;
            } else {
                sumOfOdd += num;
            }
            inputNumber = inputNumber / 10;
        }

        return sumOfOdd;
    }

}
