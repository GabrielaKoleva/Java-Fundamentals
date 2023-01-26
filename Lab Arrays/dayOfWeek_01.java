import java.util.Scanner;

public class dayOfWeek_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfDay = Integer.parseInt(scan.nextLine());

        String[] nameOfDay = {
          "Monday",
          "Tuesday",
          "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"
        };

        if (numberOfDay >= 1 && numberOfDay <= 7){
            System.out.println(nameOfDay[numberOfDay - 1]);
        }else {
            System.out.println("Invalid day!");
        }
    }
}
