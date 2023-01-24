import java.util.Scanner;

public class printPartOfTheASCC2Table_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startNumber = Integer.parseInt(scan.nextLine());
        int endNumber = Integer.parseInt(scan.nextLine());

        for (int i = startNumber; i <= endNumber; i++) {

            System.out.printf("%c ", i);

        }
    }
}
