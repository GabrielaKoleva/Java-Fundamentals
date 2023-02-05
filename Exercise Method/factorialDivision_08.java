import java.util.Scanner;

public class factorialDivision_08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int firstNumber = Integer.parseInt(scan.nextLine());
        int secondNumber = Integer.parseInt(scan.nextLine());

        long fact1 = printFactorialNumber(firstNumber);
        long fact2 = printFactorialNumber(secondNumber);

        double divisionFact = (fact1 * 1.0) / fact2;

        System.out.printf("%.2f", divisionFact);

    }
    public static long printFactorialNumber(int number){

        long factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial = factorial * i;
        }
        return factorial;
    }
}
