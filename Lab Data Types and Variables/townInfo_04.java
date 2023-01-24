import java.util.Scanner;

public class townInfo_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nameOfCity = scan.nextLine();
        int population = Integer.parseInt(scan.nextLine());
        int townArea = Integer.parseInt(scan.nextLine());

        System.out.printf("Town %s has population of %d and area %d square km.",
                nameOfCity, population, townArea);
    }
}
