import java.util.*;
public class ProductPriceManager_03 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            Map<String, Product> products = new LinkedHashMap<>();

            String input = scan.nextLine();
            while (!input.equals("buy")) {
                String[] productInfo = input.split(" ");
                String productName = productInfo[0];
                double productPrice = Double.parseDouble(productInfo[1]);
                int productQuantity = Integer.parseInt(productInfo[2]);

                if (products.containsKey(productName)) {
                    Product existingProduct = products.get(productName);
                    existingProduct.addQuantity(productQuantity);
                    if (existingProduct.getPrice() != productPrice) {
                        existingProduct.setPrice(productPrice);
                    }
                } else {
                    Product newProduct = new Product(productPrice, productQuantity);
                    products.put(productName, newProduct);
                }

                input = scan.nextLine();
            }

            for (Map.Entry<String, Product> entry : products.entrySet()) {
                String productName = entry.getKey();
                Product product = entry.getValue();
                double totalPrice = product.getPrice() * product.getQuantity();

                System.out.printf("%s -> %.2f%n", productName, totalPrice);
            }
        }
    }

    class Product {
        private double price;
        private int quantity;

        public Product(double price, int quantity) {
            this.price = price;
            this.quantity = quantity;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }

        public int getQuantity() {
            return quantity;
        }

        public void addQuantity(int quantity) {
            this.quantity += quantity;
        }
}