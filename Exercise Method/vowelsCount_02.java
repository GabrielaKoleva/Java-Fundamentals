import java.util.Scanner;

public class vowelsCount_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputText = scan.nextLine();

        printVowelsCount(inputText);

    }
    public static void printVowelsCount(String text){
        int countLetters = 0;
        for (int i = 0; i <= text.length() - 1; i++) {
            char output = text.charAt(i);

            switch (output){
                case 'a':
                case 'A':
                case 'e':
                case 'E':
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    countLetters++;
                    break;
            }
        }
        System.out.println(countLetters);
    }
}
