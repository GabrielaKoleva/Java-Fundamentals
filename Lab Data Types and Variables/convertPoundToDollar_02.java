import java.util.Scanner;

public class convertPoundToDollar_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pounds = Integer.parseInt(scan.nextLine());
        float course = 1.31f;
        double convertToDollars = (1.0 * pounds) * course;

        System.out.printf("%.3f", convertToDollars);
    }
}
