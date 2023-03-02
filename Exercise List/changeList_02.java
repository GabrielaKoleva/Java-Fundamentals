import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class changeList_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> numbers = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scan.nextLine();

        while (!command.equals("end")){
            if (command.contains("Delete")){
                int deleteElement = Integer.parseInt(command.split(" ")[1]);
                numbers.removeAll(Arrays.asList(deleteElement));
            }else if (command.contains("Insert")){
                int insertElement = Integer.parseInt(command.split(" ")[1]);
                int index = Integer.parseInt(command.split(" ")[2]);

                numbers.add(index, insertElement);
            }
            command = scan.nextLine();
        }
        for (int numb:numbers) {
            System.out.print(numb + " ");
        }
    }
}
