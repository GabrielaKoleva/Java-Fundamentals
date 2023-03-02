import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class train_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> passengers = Arrays.stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());
//в задачата се иска да въвеждаме цели числа докато не напълним капацитета на вагоните на влака.
//докато не получим командата end трябва да въвеждаме данни.
//има два вида данни първият е с команда зададена преди числото, вторият тип е само число.
//в случая ако е първият вариант трябва да split-нем по интервал и числото да го добавим към елемента на даденият индекс.
//във вторият случай просто добавяме числото и увеличаваме дължината на лист-а.

        int maxCapacityOfWagon = Integer.parseInt(scan.nextLine());

        String command = scan.nextLine();

        while (!command.contains("end")){
            String[] currentCommand = command.split(" ");
            if (currentCommand.length == 1){
                int passengerToDistribute = Integer.parseInt(command);
                for (int i = 0; i < passengers.size()-1; i++) {
                    if (passengerToDistribute + passengers.get(i) <= maxCapacityOfWagon){
                        int people = passengerToDistribute + passengers.get(i);
                        passengers.remove(i);
                        passengers.add(i, people);
                        break;
                    }
                }
            }else {
                int numberToPassengerToAdd = Integer.parseInt(currentCommand[1]);
                passengers.add(numberToPassengerToAdd);
            }
            command = scan.nextLine();
        }
        for (int item:passengers) {
            System.out.print(item + " ");
        }
    }
}
