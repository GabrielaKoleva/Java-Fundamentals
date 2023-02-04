package method;

import java.util.Scanner;

public class repeatString_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
        int count = Integer.parseInt(scan.nextLine());

        System.out.println(repeatString(input, count));
    }

    public static String repeatString(String inputString, int number){
        String result = "";
        for (int i = 0; i < number; i++) {
            result =result + inputString;
        }
        return result;

    }
}
