import java.util.Scanner;

public class reverseAnArrayOfStrings_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       String[] currentInput = scan.nextLine().split(" ");

        for (int i = 0; i < currentInput.length / 2; i++) {

            int swapIndex = currentInput.length - i - 1;

            String words = currentInput[i];
            currentInput[i] = currentInput[swapIndex];
            currentInput[swapIndex] = words;
        }
        System.out.println(String.join(" ", currentInput));
    }
}
