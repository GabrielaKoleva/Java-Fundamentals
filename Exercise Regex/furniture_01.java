import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class furniture_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<String> furniture = new ArrayList<>();
        double totalSum = 0;

        String regex = ">>(?<furniture>[A-Za-z]+)<<(?<price>[0-9]+\\.?[0-9]*)!(?<quantity>\\d+)";
        Pattern pattern = Pattern.compile(regex);

        String input = scan.nextLine();
        while (!input.equals("Purchase")){
            Matcher matcher = pattern.matcher(input);

            if (matcher.find()){
                String furnitureName = matcher.group("furniture");
                double price = Double.parseDouble(matcher.group("price"));
                int quantity = Integer.parseInt(matcher.group("quantity"));

                price = price * quantity;
                totalSum += price;

                furniture.add(furnitureName);
            }

            input = scan.nextLine();
        }
        System.out.println("Bought furniture:");
        for (String fr:furniture) {
            System.out.println(fr);
        }
        System.out.printf("Total money spend: %.2f", totalSum);
    }
}
