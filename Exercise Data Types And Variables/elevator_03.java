import java.util.Scanner;

public class elevator_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int personNumber = Integer.parseInt(scan.nextLine());
        int elevatorCapacity = Integer.parseInt(scan.nextLine());

        int count = personNumber / elevatorCapacity;

        if (count * elevatorCapacity < personNumber){
            count ++;
        }
        System.out.println(count);
    }
}
