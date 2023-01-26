import java.util.Scanner;

public class equalSums_06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < input.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }

        boolean isEqual = false;
        int index = 0;
        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }
            int rightSum = 0;
            for (int k = i + 1; k < numbers.length; k++) {
                rightSum += numbers[k];
            }
            if (leftSum == rightSum){
                isEqual = true;
                index = i;
                break;
            }
        }
        if (isEqual){
            System.out.println(index);
        }else {
            System.out.println("no");
        }
    }
}
