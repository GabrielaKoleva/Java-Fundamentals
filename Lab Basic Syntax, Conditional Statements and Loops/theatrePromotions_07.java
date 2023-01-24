import java.util.Scanner;

public class theatrePromotions_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String typeDay = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());

        int priceTicket = 0;

        switch (typeDay){
            case "Weekday":
                if ((0 <= age && age <= 18) || (64 < age && age <= 122)){
                    priceTicket = 12;
                }else if (18 < age && age <= 64){
                    priceTicket = 18;
                }
                break;
            case "Weekend":
                if ((0 <= age && age <= 18) || (64 < age && age <= 122)){
                    priceTicket = 15;
                }else if (18 < age && age <= 64){
                    priceTicket = 20;
                }
                break;
            case "Holiday":
                if (0 <= age && age <= 18){
                    priceTicket = 5;
                }else if (18 < age && age <= 64){
                    priceTicket = 12;
                }else if (64 < age && age <= 122){
                    priceTicket = 10;
                }
                break;
        }
        if (priceTicket == 0){
            System.out.println("Error!");
        }else {
            System.out.printf("%d$", priceTicket);
        }
    }
}
