import java.util.Scanner;

public class topIntegers_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

     String[] input = scan.nextLine().split(" ");
     int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < input.length - 1; i++) {
            int currentNumber = numbers[i];
            boolean isTopInteger = true;

            for (int j = i + 1; j < input.length; j++) {
                if (currentNumber <= numbers[j]) {
                    isTopInteger = false;
                    break;
                }
            }
            if (isTopInteger){
                System.out.print(currentNumber + " ");
            }
        }
        System.out.println(numbers[numbers.length - 1]);
    }
}
