import java.util.Scanner;

public class digitLettersAndOthers_05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();

        StringBuilder digitBd = new StringBuilder();
        StringBuilder letterBd = new StringBuilder();
        StringBuilder othersBd = new StringBuilder();

        for (int index = 0; index < text.length(); index++) {
            char symbol = text.charAt(index);
            if (Character.isDigit(symbol)){
                digitBd.append(symbol);
            }else if (Character.isLetter(symbol)){
                letterBd.append(symbol);
            }else {
                othersBd.append(symbol);
            }
        }
        System.out.println(digitBd);
        System.out.println(letterBd);
        System.out.println(othersBd);
    }
}
