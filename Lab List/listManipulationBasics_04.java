import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationBasics_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<Integer> numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scan.nextLine();

        while (!command.equals("end")){

            if (command.contains("Add")){

                int addNumber = Integer.parseInt(command.split(" ")[1]);
                numbers.add(addNumber);

            }else if (command.contains("RemoveAt")){

                int indexToRemove = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(indexToRemove);

            }else if (command.contains("Remove")){

                int removeElement = Integer.parseInt(command.split(" ")[1]);
                numbers.remove(Integer.valueOf(removeElement));

            }else if (command.contains("Insert")){

                String[] commandParts = command.split(" ");
                int numb = Integer.parseInt(commandParts[1]);
                int index = Integer.parseInt(commandParts[2]);
                numbers.add(index, numb);
            }
            command = scan.nextLine();
        }

        for (int number: numbers) {

            System.out.print(number + " ");
        }
    }
}
