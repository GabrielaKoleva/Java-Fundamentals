import java.util.Scanner;

public class extractFile_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] path = scan.nextLine().split("\\\\");

        String text = path[path.length - 1];
        String[] currentText = text.split("\\.");

        String fileName = currentText[0];
        String extension = currentText[1];

        System.out.printf("File name: %s%n", fileName);
        System.out.printf("File extension: %s%n", extension);

    }
}
