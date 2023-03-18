import java.util.Scanner;

public class characterMultiplier_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String input = scan.nextLine();
        String [] names = input.split("\\s+");

        String firstText = names[0];
        String secondText = names[1];

        int minLength = Math.min(firstText.length(), secondText.length()); //дължина на по-късия текст -> 5
        int maxLength = Math.max(firstText.length(), secondText.length()); //дължина на по-дългия текст -> 6

        int sum = 0;
        for (int index = 0; index < minLength; index++) {
            sum += (firstText.charAt(index) * secondText.charAt(index));
        }

        if (maxLength == minLength) {
            System.out.println(sum);
            return;
        }

        sum = getLeftSymbols(firstText, secondText, minLength, maxLength, sum);

        System.out.println(sum);

    }

    private static int getLeftSymbols(String firstText, String secondText, int minLength, int maxLength, int sum) {

        if (maxLength == firstText.length()) {

            for (int index = minLength; index < firstText.length(); index++) {
                sum += firstText.charAt(index);
            }
        } else {

            for (int index = minLength; index < secondText.length(); index++) {
                sum += secondText.charAt(index);
            }
        }
        return sum;
    }
}
