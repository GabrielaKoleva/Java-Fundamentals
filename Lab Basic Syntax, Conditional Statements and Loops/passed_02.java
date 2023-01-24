import java.util.Scanner;

public class passed_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        double grade = Double.parseDouble(input);

        if (grade >= 3){
            System.out.println("Passed!");
        }
    }
}
