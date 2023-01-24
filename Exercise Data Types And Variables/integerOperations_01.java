import java.util.Scanner;

public class integerOperations_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());
        int fourthNumber = Integer.parseInt(scan.nextLine());

        int addNumber = firstNumber + secondNumber;
        int divideNumber = addNumber / thirdNumber;
        int multiplyNumber = divideNumber * fourthNumber;

        System.out.println(multiplyNumber);
    }
}
