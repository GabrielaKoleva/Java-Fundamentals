package method;

import java.text.DecimalFormat;
import java.util.Scanner;

public class mathPower_08 {
   private static double mathPower(double number, int power){
       double result = 0;
       result = Math.pow(number, power);

       return result;
   }

   public static void main (String[]args){
       Scanner scan = new Scanner(System.in);

       double number = Double.parseDouble(scan.nextLine());
       int power = Integer.parseInt(scan.nextLine());

       System.out.println(new DecimalFormat("0.####").format(mathPower(number, power)));
   }
}
