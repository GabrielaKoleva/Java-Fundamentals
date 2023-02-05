import java.util.Scanner;

public class topNumber_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int input = Integer.parseInt(scan.nextLine());

        for (int number = 1; number <= input; number++) {

            if (isSumNumberDivisibleBy8(number) && isOddNumber(number)) {
                System.out.println(number);
            }
        }
    }
    public static boolean isSumNumberDivisibleBy8(int number){
        int sum = 0;

        while (number > 0){
            int lastDigit = number % 10;
            sum += lastDigit;
            number = number / 10;
        }
        /*if (sum % 8 == 0){
            return true;
        }else {
            return false;}*/
        return sum % 8 == 0;
    }
    public static boolean isOddNumber(int number){

        while (number > 0){
            int digit = number % 10;

            if (digit % 2 != 0){
                return true;
            }else {
                number = number / 10;
            }
        }
        return false;
    }
}