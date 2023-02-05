import java.util.Scanner;

public class smallestOfThreeNumbers_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());
        int thirdNumber = Integer.parseInt(scan.nextLine());

        printSmallestNumber(firstNumber,secondNumber,thirdNumber);
    }
    public static void printSmallestNumber(int numberOne,int numberTwo,int numberThree){
        if (numberOne < numberTwo && numberOne < numberThree){
            System.out.println(numberOne);
        }else if (numberTwo < numberOne && numberTwo < numberThree){
            System.out.println(numberTwo);
        }else {
            System.out.println(numberThree);
        }
    }
}
