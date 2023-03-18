import java.util.Scanner;

public class ceasarCipher_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        StringBuilder currentText = new StringBuilder();

        for (char symbol:input.toCharArray()) {

            char encryptedSymbol = (char) (symbol + 3);
            currentText.append(encryptedSymbol);
        }
        System.out.println(currentText);
    }
}
