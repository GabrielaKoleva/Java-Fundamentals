import java.util.Scanner;

public class snowBalls_11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double theBestValue = -1;
        int bestSnowballSnow = 0;
        int bestSnowballTime = 0;
        int bestSnowballQuantity = 0;

        for (int i = 0; i < n; i++) {
            int snowballSnow = Integer.parseInt(scan.nextLine());
            int snowballTime = Integer.parseInt(scan.nextLine());
            int snowballQuantity = Integer.parseInt(scan.nextLine());

            double snowballValue = Math.pow((snowballSnow/snowballTime),snowballQuantity);

            if (snowballValue > theBestValue){
                theBestValue = snowballValue;
                bestSnowballSnow = snowballSnow;
                bestSnowballTime = snowballTime;
                bestSnowballQuantity = snowballQuantity;
            }
        }

        System.out.printf("%d : %d = %.0f (%d)",
                bestSnowballSnow,bestSnowballTime,theBestValue,bestSnowballQuantity);

    }
}
