import java.util.Scanner;

public class reversedChars_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstCharacter = scan.nextLine();
        String secondCharacter = scan.nextLine();
        String thirdCharacter = scan.nextLine();

        System.out.printf("%S %s %s", thirdCharacter, secondCharacter, firstCharacter);
    }
}
