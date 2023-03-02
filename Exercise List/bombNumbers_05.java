import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class bombNumbers_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String[] input = scan.nextLine().split("\\s+");

        int bomb = Integer.parseInt(input[0]);
        int power = Integer.parseInt(input[1]);

        while (numbers.contains(bomb)){
            int bombIndex = numbers.indexOf(bomb);
            int start = bombIndex - power;
            int end = bombIndex + power;

            if (start < 0){
                start = 0;
            }
            if (end > numbers.size()){
                end = numbers.size() - 1;
            }

            for (int i = start; i <= end; i++) {
                numbers.remove(start);
            }
        }
        int sum = 0;

        for (int numb:numbers) {
            sum += numb;
        }
        System.out.println(sum);
    }
}
