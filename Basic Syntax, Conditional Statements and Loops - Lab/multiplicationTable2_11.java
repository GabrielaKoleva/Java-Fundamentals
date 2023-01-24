import java.util.Scanner;

public class multiplicationTable2_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = Integer.parseInt(scan.nextLine());
        int multiplicationFromNumber = Integer.parseInt(scan.nextLine());

        for (int i = multiplicationFromNumber; i <= 10; i++) {
            System.out.printf("%d X %d = %d%n",number, i, number*i);

        }
        if (multiplicationFromNumber > 10){
            System.out.printf("%d X %d = %d",number,multiplicationFromNumber,
                    number*multiplicationFromNumber);
        }
    }
}
