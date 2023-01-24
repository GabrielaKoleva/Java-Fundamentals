import java.util.Scanner;

public class vacation_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scan.nextLine());
        String typeOfGroupPeople = scan.nextLine();
        String dayOfWeek = scan.nextLine();

        double priceForOnePerson = 0;
        double totalPrice = 0;

        switch (dayOfWeek){
            case "Friday":
                if (typeOfGroupPeople.equals("Students")){
                    priceForOnePerson = 8.45;
                    totalPrice = priceForOnePerson * numberOfPeople;
                    if (numberOfPeople >= 30){
                        totalPrice = totalPrice - (totalPrice * 0.15);
                    }
                }else if (typeOfGroupPeople.equals("Business")){
                    priceForOnePerson = 10.90;
                    totalPrice = priceForOnePerson * numberOfPeople;
                    if (numberOfPeople >= 100){
                        totalPrice = totalPrice - (priceForOnePerson * 10);
                    }
                }else if (typeOfGroupPeople.equals("Regular")){
                    priceForOnePerson = 15;
                    totalPrice = priceForOnePerson * numberOfPeople;
                    if (numberOfPeople >= 10 && numberOfPeople <= 20){
                        totalPrice = totalPrice - (totalPrice * 0.05);
                    }
                }
                break;
            case "Saturday":
                if (typeOfGroupPeople.equals("Students")){
                    priceForOnePerson = 9.80;
                    totalPrice = priceForOnePerson * numberOfPeople;
                    if (numberOfPeople >= 30){
                        totalPrice = totalPrice - (totalPrice * 0.15);
                    }
                }else if (typeOfGroupPeople.equals("Business")){
                    priceForOnePerson = 15.60;
                    totalPrice = priceForOnePerson * numberOfPeople;
                    totalPrice = totalPrice - (priceForOnePerson * 10);
                }else if (typeOfGroupPeople.equals("Regular")){
                    priceForOnePerson = 20;
                    totalPrice = priceForOnePerson * numberOfPeople;
                    if (numberOfPeople >= 10 && numberOfPeople <= 20){
                        totalPrice = totalPrice - (totalPrice * 0.05);
                    }
                }
                break;
            case "Sunday":
                if (typeOfGroupPeople.equals("Students")){
                    priceForOnePerson = 10.46;
                    totalPrice = priceForOnePerson * numberOfPeople;
                    if (numberOfPeople >= 30){
                        totalPrice = totalPrice - (totalPrice * 0.15);
                    }
                }else if (typeOfGroupPeople.equals("Business")){
                    priceForOnePerson = 16;
                    totalPrice = priceForOnePerson * numberOfPeople;
                    totalPrice = totalPrice - (priceForOnePerson * 10);
                }else if (typeOfGroupPeople.equals("Regular")){
                    priceForOnePerson = 22.50;
                    totalPrice = priceForOnePerson * numberOfPeople;
                    if (numberOfPeople >= 10 && numberOfPeople <= 20){
                        totalPrice = totalPrice - (totalPrice * 0.05);
                    }
                }
                break;
        }
        System.out.printf("Total price: %.2f", totalPrice);
    }
}
