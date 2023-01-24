import java.util.Scanner;

public class charsToString_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       char firstCharacter = scan.nextLine().charAt(0);
       char secondCharacter = scan.nextLine().charAt(0);
       char thirdCharacter = scan.nextLine().charAt(0);

        System.out.printf("%c%c%c", firstCharacter, secondCharacter, thirdCharacter);

    }
}
