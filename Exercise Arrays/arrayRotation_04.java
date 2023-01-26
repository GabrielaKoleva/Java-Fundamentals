import java.util.Scanner;

public class arrayRotation_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] input = scan.nextLine().split(" ");
        int counter = Integer.parseInt(scan.nextLine());

        /*% input.length --> може да оптимизираме задачата, защото ако са 4 числа и ги
        * завъртим 4 пъти пак ще се отпечатат като входа който сме задали*/

        for (int i = 0; i < counter /*% input.length*/; i++) {
            String temp = input[0];

            for (int j = 0; j < input.length - 1; j++) {
                input[j] = input[j + 1];
            }
            input[input.length - 1] = temp;
        }
        System.out.println(String.join(" ", input));
    }
}
