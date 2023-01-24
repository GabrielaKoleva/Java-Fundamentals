import java.util.Locale;
import java.util.Scanner;

public class vendingMachine_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

      double sum = 0;

      String input = scan.nextLine();

      while (!input.equals("Start")){
          double coin = Double.parseDouble(input);

          if (coin == 0.1|| coin==0.2|| coin==0.5|| coin==1|| coin==2){
              sum += coin;
          }else {
              System.out.printf("Cannot accept %.2f%n", coin);
          }
          input = scan.nextLine();
      }
      double price = 0;
      String output = scan.nextLine();
      boolean flag = false;
      while (!output.equals("End")){

          switch (output.toLowerCase()){
              case "nuts":
                  price = 2;
                  flag = true;
                  break;
              case "water":
                  price = 0.7;
                  flag = true;
                  break;
              case  "crisps":
                  price = 1.5;
                  flag = true;
                  break;
              case "soda":
                  price = 0.8;
                  flag = true;
                  break;
              case "coke":
                  price = 1;
                  flag = true;
                  break;
          }

          if (sum < price){
              System.out.println("Sorry, not enough money");
          }else if (flag){
              sum -= price;
              System.out.printf("Purchased %s%n", output);
          }else {
              System.out.println("Invalid product");
          }
          output = scan.nextLine();
      }
        System.out.printf("Change: %.2f", sum);
    }
}
