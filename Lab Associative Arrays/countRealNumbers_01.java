import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class countRealNumbers_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double[] numbersArr = Arrays.stream(scan.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();

        TreeMap<Double, Integer> countMap = new TreeMap<>();
        for (Double currentNumb:numbersArr) {
            if (!countMap.containsKey(currentNumb)) {
                countMap.put(currentNumb, 1);
            } else {
                int value = countMap.get(currentNumb);
                countMap.put(currentNumb, value + 1);
            }
        }
            for (Map.Entry<Double, Integer> entry:countMap.entrySet()) {
                System.out.printf("%.0f -> %d%n", entry.getKey(), entry.getValue());
        }
    }
}
