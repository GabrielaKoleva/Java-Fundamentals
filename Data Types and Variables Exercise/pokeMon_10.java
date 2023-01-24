import java.util.Scanner;

public class pokeMon_10 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int startPokePower = Integer.parseInt(scan.nextLine());
        int distance = Integer.parseInt(scan.nextLine());
        int exhaustionFactor  = Integer.parseInt(scan.nextLine());

        int currentPokePower = startPokePower;
        int counter = 0;

        while (currentPokePower >= distance){
            currentPokePower -= distance;
            counter ++;

            if ((currentPokePower == startPokePower / 2.0) &&
                    (exhaustionFactor != 0)){
                currentPokePower = currentPokePower / exhaustionFactor;
            }
        }
        System.out.println(currentPokePower);
        System.out.println(counter);
    }
}
