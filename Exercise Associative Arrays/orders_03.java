import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class orders_03 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        Map<String, Integer> productQuantity = new LinkedHashMap<>();
        Map<String, Double> productPrice = new LinkedHashMap<>();

        while (!input.equals("buy")){
            String productName = input.split("\\s+")[0];
            double price = Double.parseDouble(input.split("\\s+")[1]);
            int quantity = Integer.parseInt(input.split("\\s+")[2]);

            if (productQuantity.containsKey(productName)){
                int currentQuantity = productQuantity.get(productName);
                productQuantity.put(productName, quantity + currentQuantity);
            }else {
                productQuantity.put(productName, quantity);
            }

            productPrice.put(productName, price);

            input = scan.nextLine();
        }
        for (Map.Entry<String, Integer> entry: productQuantity.entrySet()){
            String nameOfProduct = entry.getKey();
            double finalPrice = productPrice.get(nameOfProduct)
                    * productQuantity.get(nameOfProduct);
            System.out.printf("%s -> %.2f%n", nameOfProduct, finalPrice);
        }
    }
}
