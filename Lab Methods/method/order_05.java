package method;

import java.util.Scanner;

public class order_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputProduct = scan.nextLine();
        int quantityInput = Integer.parseInt(scan.nextLine());

        printTotalSum(inputProduct, quantityInput);
    }
    public static double getProduct(String product){
        double amountOfProduct = 0;
        switch (product){
            case "coffee":
                amountOfProduct = 1.5;
                break;
            case "water":
                amountOfProduct = 1;
                break;
            case "coke":
                amountOfProduct = 1.4;
                break;
            case "snacks":
                amountOfProduct = 2;
                break;
        }
        return amountOfProduct;
    }

    public static double getTotalSum(String product, int quantity){
        double amount = getProduct(product);
        return amount * quantity;
    }

    public static void printTotalSum(String product, int quantity){
        double sum = getTotalSum(product, quantity);
        System.out.printf("%.2f", sum);
    }

}
