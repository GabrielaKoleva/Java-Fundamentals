import java.util.Scanner;

public class reverseString_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String text = scan.nextLine();


        while (!text.equals("end")){
            String reverse = "";

            for (int i = text.length() - 1; i >= 0; i--) {
                char symbol = text.charAt(i);
                reverse = reverse + symbol;
            }
            System.out.printf("%s = %s%n", text, reverse);

            text = scan.nextLine();
        }
    }
}
