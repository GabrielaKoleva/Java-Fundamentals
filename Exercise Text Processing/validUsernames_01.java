import java.util.Scanner;

public class validUsernames_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        String[] usernames = text.split(", ");

        for (String currentUser : usernames) {

            if (isValid(currentUser)) {
                System.out.println(currentUser);
            }
        }
    }
    private static boolean isValid(String username) {

        if (username.length() < 3 || username.length() > 16) {
            return false;
        }
        for (char symbol : username.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol) && symbol != '_' && symbol != '-') {
                return false;
            }
        }
        return true;
    }
}
