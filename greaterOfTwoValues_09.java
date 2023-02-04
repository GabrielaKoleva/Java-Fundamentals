package method;

import java.util.Scanner;

public class greaterOfTwoValues_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        switch (input){
            case "int":

                int firstNumber = Integer.parseInt(scan.nextLine());
                int secondNumber = Integer.parseInt(scan.nextLine());

                System.out.println(getMax(firstNumber,secondNumber));
                break;
            case "char":
                char firstInput = scan.nextLine().charAt(0);
                char secondInput = scan.nextLine().charAt(0);

                System.out.println(getMax(firstInput,secondInput));
                break;
            case "string":

                String strFirst = scan.nextLine();
                String strSecond = scan.nextLine();

                System.out.println(getMax(strFirst,strSecond));

                break;
        }

    }
    public static int getMax(int firstNumber, int secondNumber){
        if (firstNumber > secondNumber){
            return firstNumber;
        }else {
            return secondNumber;
        }
    }
    public static char getMax(char firstInput,char secondInput){
        if (firstInput > secondInput){
            return firstInput;
        }else {
            return secondInput;
        }
    }
    public static String getMax(String strFirst, String strSecond){
     if (strFirst.compareTo(strSecond) > 0){
         return strFirst;
     }else {
         return strSecond;
     }
    }
}
