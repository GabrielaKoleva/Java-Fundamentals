import java.util.Scanner;

public class rageExpenses_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int lostGames = Integer.parseInt(scan.nextLine());
        double headsetPrice = Double.parseDouble(scan.nextLine());
        double mousePrice = Double.parseDouble(scan.nextLine());
        double keyboardPrice = Double.parseDouble(scan.nextLine());
        double displayPrice = Double.parseDouble(scan.nextLine());

        int count = 0;
        int headsetCount = 0;
        int mouseCount = 0;
        int keyboardCount = 0;
        int displayCount = 0;
        double totalPrice = 0;

        for (int i = 0; i <= lostGames; i++) {

            if (count % 2 == 0 && count != 0){
                headsetCount ++;
                totalPrice += headsetPrice;
            }
            if (count % 3 == 0 && count != 0){
                mouseCount ++;
                totalPrice += mousePrice;
            }
            if (count % 6 == 0 && count != 0){
                keyboardCount ++;
                totalPrice += keyboardPrice;
            }
            if (count % 12 == 0 && count != 0){
                displayCount ++;
                totalPrice += displayPrice;
            }
            count ++;
        }
        System.out.printf("Rage expenses: %.2f lv.", totalPrice);
    }
}
