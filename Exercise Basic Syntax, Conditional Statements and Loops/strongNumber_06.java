import java.util.Scanner;

public class strongNumber_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputNumber = scan.nextLine();

        int totalSum = 0;

        for (int i = 0; i < inputNumber.length(); i++) {
            int digit = Integer.parseInt("" + inputNumber.charAt(i));
            int currentSum = 1;
            for (int j = 1; j <= digit; j++) {
                currentSum *= j;
            }
            totalSum += currentSum;
        }

        int number = Integer.parseInt(inputNumber);

        if (number == totalSum){
            System.out.println("yes");
        }else {
            System.out.println("no");
        }
    }
}
