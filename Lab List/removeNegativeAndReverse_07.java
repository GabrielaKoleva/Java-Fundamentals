import java.util.*;
import java.util.stream.Collectors;

public class removeNegativeAndReverse_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> inputNumbers = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> positiveNumbers = new ArrayList<>();

        for (int numbers:inputNumbers) {

            if (numbers >= 0){
               positiveNumbers.add(numbers);
            }
        }

        Collections.reverse(positiveNumbers);

        if (positiveNumbers.size()==0){
            System.out.println("empty");
        }else {
            System.out.println(positiveNumbers.toString()
                    .replace("[", "")
                    .replace("]","")
                    .replaceAll(",", ""));
        }
    }
}
