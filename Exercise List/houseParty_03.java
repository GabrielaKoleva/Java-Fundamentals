import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class houseParty_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       List<String> nameOfGuests = new ArrayList<>();

        int n = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < n; i++) {
// Правим String променлива в която ще подаваме комадите.
// След това тази String променлива я преобразуваме в List, за да може да я split-нем по интервали.
            String command = scan.nextLine();
            List<String> commandParts = Arrays.stream(command.split(" ")).collect(Collectors.toList());

            String name = commandParts.get(0);
// проверките ги правим по дължината на лист-а.
// Ако дължината е до три елемента влиза в Name is going!
            if (commandParts.size() == 3){
                if (nameOfGuests.contains(name)){
                    System.out.printf("%s is already in the list!%n", name);
                }else {
                    nameOfGuests.add(name);
                }
// Ако дължината е 4 елемента влиза в проверката Name is not going!
            }else if (commandParts.size() == 4){
                if (nameOfGuests.contains(name)){
                    nameOfGuests.remove(name);
                }else {
                    System.out.printf("%s is not in the list!%n", name);
                }
            }
        }
        for (String guest:nameOfGuests) {
            System.out.println(guest);
        }
    }
}
