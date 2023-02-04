package method;

import java.util.Scanner;

public class mathOperations_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberFirst = Integer.parseInt(scan.nextLine());
        String operator = scan.nextLine();
        int numberSecond = Integer.parseInt(scan.nextLine());

        System.out.printf("%.0f", getOperations(operator, numberFirst, numberSecond));
    }

    public static double getOperations(String operator,int numberOne,int numberTwo){
        double result = 0;
        switch (operator){
            case "+":
                result = numberOne + numberTwo;
                break;
            case "-":
                result = numberOne - numberTwo;
                break;
            case "*":
                result = numberOne * numberTwo;
                break;
            case "/":
                result = (numberOne * 1.0) / numberTwo;
                break;
        }
        return result;
    }
}
