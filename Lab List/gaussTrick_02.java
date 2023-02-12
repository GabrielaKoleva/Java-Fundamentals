import java.sql.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class gaussTrick_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        int sizeList = numbers.size();

        for (int i = 0; i < sizeList / 2; i++) {
            int firstNumber = numbers.get(i);
            int secondNumber = numbers.get(numbers.size() - 1);

            numbers.set(i, firstNumber + secondNumber);

            numbers.remove(numbers.size() - 1);
        }
        for (int element:numbers) {
            System.out.print(element + " ");
        }
    }
}
