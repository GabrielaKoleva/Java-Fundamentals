import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class mergingLists_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<Integer> firstListOfNumbers = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> secondListOfNumbers = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        List<Integer> resolveList = new ArrayList<>();

        int minSize = Math.min(firstListOfNumbers.size(), secondListOfNumbers.size());

        for (int i = 0; i < minSize; i++) {
            int firstItem = firstListOfNumbers.get(i);
            int secondItem = secondListOfNumbers.get(i);

            resolveList.add(firstItem);
            resolveList.add(secondItem);
        }

        if (firstListOfNumbers.size() > secondListOfNumbers.size()) {
            resolveList.addAll(firstListOfNumbers.subList(minSize, firstListOfNumbers.size()));
        } else {
            resolveList.addAll(secondListOfNumbers.subList(minSize, secondListOfNumbers.size()));
        }

        System.out.println(resolveList.toString().replaceAll("[\\[\\],]", ""));
    }
}
