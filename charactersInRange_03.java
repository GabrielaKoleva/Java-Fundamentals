import java.util.Scanner;

public class charactersInRange_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char symbol1 = scan.nextLine().charAt(0);
        char symbol2 = scan.nextLine().charAt(0);

        printCharacter(symbol1, symbol2);
    }
    public static void printCharacter(char symbol1, char symbol2){

        if (symbol1 < symbol2){
            for (char symbol = (char) (symbol1 + 1); symbol < symbol2; symbol++) {
                System.out.print(symbol + " ");
            }
        }else if (symbol1 > symbol2){
            for (char symbol = (char) (symbol2 + 1); symbol < symbol1; symbol++) {
                System.out.print(symbol + " ");
            }
        }
    }
}
