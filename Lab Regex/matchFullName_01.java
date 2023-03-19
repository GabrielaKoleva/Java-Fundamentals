import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class matchFullName_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String names = scan.nextLine();
        String regex = "\\b[A-Z][a-z]+\\s[A-Z][a-z]+\\b";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(names);

        while (matcher.find()){
            String fullName = matcher.group();
            System.out.print(fullName + " ");
        }
    }
}
