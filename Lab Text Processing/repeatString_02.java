import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class repeatString_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       /* String[] strings = scan.nextLine().split(" ");

        // Concatenate each string with itself N times
        String concatenatedString = "";
        for (String currentString : strings) {
            concatenatedString += currentString.repeat(currentString.length());
        }
        // Print concatenated string
        System.out.println(concatenatedString);*/

        String[] stringArr = scan.nextLine().split(" ");

        List<String> repeatList = new ArrayList<>();
        for (int i = 0; i < stringArr.length; i++) {
            String currentText = stringArr[i];

            int length = currentText.length();

            String repeatWord = repeatString(length, currentText);

            repeatList.add(repeatWord);
        }
        System.out.println(String.join("", repeatList));
    }

    public static String repeatString(int n, String word) {
        String result = "";
        for (int i = 0; i < n; i++) {
            result = result + word;
        }
        return result;
    }
}
