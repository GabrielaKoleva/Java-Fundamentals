package method;

import java.util.Scanner;

public class signOfInteger_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        printSignInteger(number);
    }

    public static void printSignInteger(int number) {
        String signWord = "";

        if (number > 0){
            signWord = "positive";
        }else if (number < 0){
            signWord = "negative";
        }else {
            signWord = "zero";
        }
        System.out.printf("The number %d is %s.%n", number, signWord);
    }
}