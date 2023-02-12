import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class listOfProducts_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());

        List<String> products = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String inputProducts = scan.nextLine();
            products.add(inputProducts);
        }

        Collections.sort(products);

        int number = 1;
        for (String product:products){
            System.out.println(number + "." + product);
            number++;
        }

    }
}
