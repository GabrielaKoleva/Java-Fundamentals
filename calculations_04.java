package method;

import java.util.Scanner;

public class calculations_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String commandInput = scan.nextLine();

        int firstInputNumber = Integer.parseInt(scan.nextLine());
        int secondInputNumber = Integer.parseInt(scan.nextLine());

        switch (commandInput){
            case "add":
                printAddCalculation(firstInputNumber,secondInputNumber);
                break;
            case "multiply":
                printMultiplyCalculation(firstInputNumber,secondInputNumber);
                break;
            case "subtract":
                printSubtractCalculation(firstInputNumber,secondInputNumber);
                break;
            case "divide":
                printDivideCalculation(firstInputNumber,secondInputNumber);
                break;
        }
    }
    public static void printAddCalculation(int firsNumber,int secondNumber){
        int add = firsNumber + secondNumber;
        System.out.println(add);
    }
    public static void printMultiplyCalculation(int firstNumber, int secondNumber) {
        int multiply = firstNumber * secondNumber;
        System.out.println(multiply);
    }
    public static void printSubtractCalculation(int firstNumber, int secondNumber){
        int subtract = firstNumber - secondNumber;
        System.out.println(subtract);
    }
    public static void printDivideCalculation(int firstNumber, int secondNumber){
        int divide = firstNumber / secondNumber;
        System.out.println(divide);
    }
}
