import java.util.Scanner;

public class login_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String userName = scan.nextLine();
        String password = "";

        for (int i = userName.length() -1; i >= 0; i--) {
            password += userName.charAt(i);
        }

        boolean isLogged = false;
        for (int i = 1; i < 4; i++) {
            String inputPassword = scan.nextLine();
            if (password.equals(inputPassword)){
                isLogged = true;
                System.out.printf("User %s logged in.", userName);
                break;
            }
            System.out.println("Incorrect password. Try again.");
        }
        if (!isLogged){
            System.out.printf("User %s blocked!", userName);
        }
    }
}
