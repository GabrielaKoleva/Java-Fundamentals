import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scan.nextLine());
        int capacityOfElevator = Integer.parseInt(scan.nextLine());

        int count = numberOfPeople / capacityOfElevator;

        if(capacityOfElevator * count < numberOfPeople){
            count ++;
        }
        System.out.println(count);

    }
}
