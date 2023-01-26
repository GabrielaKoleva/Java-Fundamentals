import java.util.Scanner;

public class zigZagArrays_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int number = Integer.parseInt(scan.nextLine());
       String[] firstNumber = new String[number];
       String[] secondNumber = new String[number];

        for (int i = 0; i < number; i++) {
            String[] input = scan.nextLine().split(" ");

            String firstElement = input[0];
            String secondElement = input[1];

            if (i % 2 == 0){
                firstNumber[i] = firstElement;
                secondNumber[i] = secondElement;
            }else {
                secondNumber[i] = firstElement;
                firstNumber[i] = secondElement;
            }
        }
        System.out.println(String.join(" ", firstNumber));
        System.out.println(String.join(" ", secondNumber));

    }
}
