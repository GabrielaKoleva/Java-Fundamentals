import java.util.Scanner;

public class centuriesToMinutes_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int century = Integer.parseInt(scan.nextLine());
        int years = century * 100;
        int days = (int) ((int) years * 365.2422);

        long hours = days * 24;
        long minutes = hours * 60;


        System.out.printf("%d centuries = %d years = %d days = %d hours = %d minutes",
                century, years, days, hours, minutes);
    }
}
