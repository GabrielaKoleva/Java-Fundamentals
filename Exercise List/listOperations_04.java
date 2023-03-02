import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listOperations_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scan.nextLine();

        while (!command.equals("End")){

            if (command.contains("Add")){
                int currentNumberToAdd = Integer.parseInt(command.split("\\s+")[1]);
                numbers.add(currentNumberToAdd);

            }else if (command.contains("Insert")){
                int numberToInsert = Integer.parseInt(command.split("\\s+")[1]);
                int index = Integer.parseInt(command.split("\\s+")[2]);

                if (index >= 0 && index <= numbers.size() - 1){
                    numbers.add(index, numberToInsert);
                }else {
                    System.out.println("Invalid index");
                }

            }else if (command.contains("Remove")){
                int indexToRemove = Integer.parseInt(command.split("\\s+")[1]);

                if (indexToRemove >= 0 && indexToRemove <= numbers.size() - 1){
                    numbers.remove(indexToRemove);
                }else {
                    System.out.println("Invalid index");
                }

            }else if (command.contains("Shift left")){
                int numberToTheLeft = Integer.parseInt(command.split("\\s+")[2]);

                for (int i = 1; i <= numberToTheLeft; i++) {
                    int firstElement = numbers.get(0);
                    numbers.remove(0);
                    numbers.add(firstElement);
                }

            }else if (command.contains("Shift right")){
                int numberToTheRight = Integer.parseInt(command.split("\\s+")[2]);

                for (int i = 1; i <= numberToTheRight; i++) {
                    int lastElement = numbers.get(numbers.size() - 1);
                    numbers.remove(numbers.size()-1);
                    numbers.add(0, lastElement);
                }
            }
            command = scan.nextLine();
        }
        for (int number:numbers) {
            System.out.print(number + " ");
        }
    }
}
