import java.util.Scanner;

public class triplesOfLatinLetters_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());

        for (char i = 97; i < 97 + number; i++) {
            for (char j = 97; j < 97 + number; j++) {
                for (char k = 97; k < 97 + number; k++) {
                    System.out.printf("%c%c%c%n", i, j, k);
                }
            }
        }
    }
}
