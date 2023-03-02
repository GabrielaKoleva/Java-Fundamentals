import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class randomizeWords_solution01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


    //System.out.print("Enter a sentence: ");
    String sentence = scan.nextLine();

    String[] words = sentence.split("\\s+");
    List<String> wordList = Arrays.asList(words);
    Collections.shuffle(wordList);

    for (String word : wordList) {
        System.out.println(word);
     }
    }
}
