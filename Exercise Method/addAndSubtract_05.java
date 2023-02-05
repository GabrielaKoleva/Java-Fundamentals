import java.util.Scanner;

public class addAndSubtract_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());

        int sumOfDigits = sum(firstNumber, secondNumber);
        int subtractOfDigits = subtract(sumOfDigits, thirdNumber);

        System.out.println(subtractOfDigits);
    }
    public static int sum(int number1, int number2){
        return number1 + number2;
    }
    public static int subtract(int number1, int number2){
        return number1 - number2;
    }
}
