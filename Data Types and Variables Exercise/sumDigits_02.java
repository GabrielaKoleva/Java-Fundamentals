import java.util.Scanner;

public class sumDigits_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int number = Integer.parseInt(scan.nextLine());
       int sum = 0;

       while (number > 0){
           int lastDigit = number % 10;
           sum += lastDigit;
           number = number / 10;
       }
        System.out.println(sum);
    }
}
