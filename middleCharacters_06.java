import java.util.Scanner;

public class middleCharacters_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputText = scan.nextLine();

        printMiddleChar(inputText);
    }

    public static void printMiddleChar(String text){

        if (text.length() % 2 != 0){
            int indexOfMiddleChar = text.length() / 2;
            System.out.println(text.charAt(indexOfMiddleChar));
        }else {
            int firstMiddleChar = text.length() / 2 - 1;
            int secondMiddleChar = firstMiddleChar + 1;

            System.out.print(text.charAt(firstMiddleChar));
            System.out.print(text.charAt(secondMiddleChar));
        }
    }
}
