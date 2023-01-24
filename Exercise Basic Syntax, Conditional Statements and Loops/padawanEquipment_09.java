import java.util.Scanner;

public class padawanEquipment_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double ivanChoBudget = Double.parseDouble(scan.nextLine());
        int countStudent = Integer.parseInt(scan.nextLine());
        double lightsaberPrice = Double.parseDouble(scan.nextLine());
        double rodePrice = Double.parseDouble(scan.nextLine());
        double beltPrice = Double.parseDouble(scan.nextLine());

        double finalPriceLightsabers = Math.ceil(countStudent * 1.1) * lightsaberPrice;
        double finalPriceRobes = rodePrice * countStudent;
        int freeBelt = countStudent / 6;
        double finalPriceBelt = beltPrice * (countStudent - freeBelt);

        double totalPrice = finalPriceLightsabers + finalPriceRobes + finalPriceBelt;

        if (ivanChoBudget >= totalPrice){
            System.out.printf("The money is enough - it would cost %.2flv.", totalPrice);
        }else {
            double needMoney = totalPrice - ivanChoBudget;
            System.out.printf("George Lucas will need %.2flv more.", needMoney);
        }
    }
}
