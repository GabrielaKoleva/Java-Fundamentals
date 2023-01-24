import java.util.Scanner;

public class spiceMustFlow_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int inputQuantityOfSpice = Integer.parseInt(scan.nextLine());

       int counterDays = 0;
       int income = 0;

       while (inputQuantityOfSpice >= 100){
           income += inputQuantityOfSpice - 26;
           counterDays ++;

           inputQuantityOfSpice -= 10;
       }
       if (income >= 26){
           income -= 26;
       }
        System.out.println(counterDays);
        System.out.println(income);

    }
}
