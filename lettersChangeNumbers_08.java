import java.util.Locale;
import java.util.Scanner;

public class lettersChangeNumbers_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        String[] currentInput = input.split("\\s+");

        double totalSum = 0;
        for (String code:currentInput) {

            double modifiedNumber = getModifiedNumber(code);
            totalSum += modifiedNumber;
        }
        System.out.printf("%.2f", totalSum);
    }

    private static double getModifiedNumber(String code){
        char letterBefore = code.charAt(0);
        char letterAfter = code.charAt(code.length() - 1);

        double number = Double.parseDouble(code.replace(letterBefore,' ')
                .replace(letterAfter, ' ').trim());


        if (Character.isUpperCase(letterBefore)){
            int positionLetter = (int) letterBefore - 64;
            number /= positionLetter;
        }else {
            int positionLetter = (int) letterBefore - 96;
            number *= positionLetter;
        }

        if (Character.isUpperCase(letterAfter)){
            int positionLetter = (int) letterAfter - 64;
            number -= positionLetter;
        }else {
            int positionLetter = (int) letterAfter - 96;
            number += positionLetter;
        }
        return number;
    }
}
