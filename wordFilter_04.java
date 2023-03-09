import java.util.Arrays;
import java.util.Scanner;

public class wordFilter_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] wordsArr = Arrays.stream(scan.nextLine().split(" "))
                .filter(w -> w.length() % 2 == 0).toArray(String[]::new);

        System.out.println(String.join(System.lineSeparator(), wordsArr));
    }
}
