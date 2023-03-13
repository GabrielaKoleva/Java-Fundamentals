import java.util.Scanner;

public class textFilter_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*String [] banWordArr = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (String banWord:banWordArr) {
            String asterisk = replaceText(banWord.length());
            text = text.replace(banWord, asterisk);
        }
        System.out.println(text);
    }
    public static String replaceText(int n){
        String result = "";
        for (int i = 0; i < n; i++) {
            result += "*";
        }
        return result;
    }*/
        String[] bannedWordsArr = scan.nextLine().split(", ");
        String text = scan.nextLine();

        for (String word : bannedWordsArr) {
            String regex = "\\b" + word + "\\b";
            String asterisks = "*".repeat(word.length());
            text = text.replaceAll(regex, asterisks);
        }
        System.out.println(text);
    }
}
