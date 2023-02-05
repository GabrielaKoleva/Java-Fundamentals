import java.util.Scanner;

public class passwordValidator_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String password = scan.nextLine();

        boolean isPasswordValidLength = isPasswordValidLength(password);
        if (!isPasswordValidLength){
            System.out.println("Password must be between 6 and 10 characters");
        }
        boolean isValidContent = isPasswordConsistLetterOrDigit(password);
        if (!isValidContent){
            System.out.println("Password must consist only of letters and digits");
        }
        boolean isHaveDigits = isPasswordHaveDigits(password);
        if (!isHaveDigits){
            System.out.println("Password must have at least 2 digits");
        }

        if (isPasswordValidLength && isValidContent && isHaveDigits){
            System.out.println("Password is valid");
        }

    }
    public static boolean isPasswordValidLength(String password){
        return password.length() >= 6 && password.length() <= 10;
    }
    public static boolean isPasswordConsistLetterOrDigit(String password){
        for (char symbol: password.toCharArray()) {
            if (!Character.isLetterOrDigit(symbol)){
                return false;
            }
        }
        return true;
    }
    public static boolean isPasswordHaveDigits(String password){
        int countDigit = 0;
        for (char digits: password.toCharArray()) {
            if (Character.isDigit(digits)){
                countDigit ++;
            }
        }
        return countDigit >= 2;
    }
}
