import java.util.Scanner;

public class kaminoFactory_09 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

       int sizeFiled = Integer.parseInt(scan.nextLine());

       String input = scan.nextLine();
       String forAllZeros = input;

       int numberDNATest = 0;
       int localNumber = 0;
       int bestSum = 0;
       int bestLength = 0;
       int bestNumber = 0;
       int bestIndex = 0;
       String bestSequence = "";
       String bestInput = "";
       boolean zeros = false;

       String localInput = "";
       while (!input.equals("Clone Them!")){
           String noChars = input.replaceAll("!+", "");
           String[] noZeros = noChars.split("0");
           numberDNATest ++;
           int localLength = 0;
           String localSequence = "";
           int sum = 0;

           for (int j = 0; j < noZeros.length; j++) {
               if (noZeros[j].length()>localLength){
                   localLength = noZeros[j].length();
                   localNumber = numberDNATest;
                   localSequence = noZeros[j];
                   localInput = noChars;
               }
               sum += noZeros[j].length();
               if (sum > 0){
                   zeros = true;
               }
           }
           int localIndex = noChars.indexOf(localSequence);

           if (localLength > bestLength){
               bestLength = localLength;
               bestNumber = numberDNATest;
               bestInput = localInput;
               bestSum = sum;
               bestIndex = localIndex;
           }else if (localLength == bestLength){
               if (localIndex < bestIndex){
                   bestLength = localLength;
                   bestNumber = numberDNATest;
                   bestInput = localInput;
                   bestSum = sum;
                   bestIndex = localIndex;
               }else if (localIndex == bestIndex){
                   if (bestSum < sum){
                       bestLength = localLength;
                       bestNumber = numberDNATest;
                       bestInput = localInput;
                       bestSum = sum;
                       bestIndex = localIndex;
                   }
               }else {
                   continue;
               }
           }
           localLength = 0;
           localNumber = 0;
           localSequence = "";
           localInput = "";
           sum = 0;

           input = scan.nextLine();
       }
       if (zeros == false){
           String output1 = forAllZeros.replaceAll("!+",""); //Проверка когато входа е 0!0!
           String[] bestAllZero = output1.split("");

           System.out.println("Best DNA sample 1" + "with sum: " + 0 + ".");
           for (int i = 0; i < bestAllZero.length; i++) {
               System.out.println(bestAllZero[i] + " ");
           }
       }else {
           String[] output = bestInput.split("");

           System.out.println("Best DNA sample" + bestNumber + "with sum: " + bestSum + ".");
           for (int i = 0; i < output.length; i++) {
               System.out.print(output[i] + "");
           }
       }
    }
}
