import java.util.Scanner;

public class palindromeIntegers_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        while (!input.equals("END")) {

            if (isPalindrome(input)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }

            input = scan.nextLine();
        }
    }
    public static boolean isPalindrome(String text){
        String reverseText = "";
        for (int index = text.length() - 1; index >= 0; index--) {
            reverseText += text.charAt(index);
        }
        return text.equals(reverseText);
    }
}
