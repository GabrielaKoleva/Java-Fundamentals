import java.util.Scanner;

public class substring_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String firstString = scan.nextLine();
        String secondString = scan.nextLine();

        /*while (secondString.contains(firstString)){
            secondString = secondString.replace(firstString, "");
        }
        System.out.println(secondString);*/

        int index = secondString.indexOf(firstString);
        while (index != -1){
            secondString = secondString.replace(firstString, "");

            index = secondString.indexOf(firstString);
        }
        System.out.println(secondString);
    }
}
