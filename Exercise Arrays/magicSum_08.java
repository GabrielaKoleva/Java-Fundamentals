import java.util.Scanner;

public class magicSum_08 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       String[] input = scan.nextLine().split(" ");
       int[] numbers = new int[input.length];

       int digit = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        for (int i = 0; i < numbers.length; i++) {

            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == digit){
                    System.out.println(numbers[i] + " " + numbers[j]);
                }
            }

        }
    }
}
