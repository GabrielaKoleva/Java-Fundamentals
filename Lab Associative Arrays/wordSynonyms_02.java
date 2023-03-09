import java.util.*;

public class wordSynonyms_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int number = Integer.parseInt(scan.nextLine());

        Map<String, ArrayList<String>> wordSynonyms = new LinkedHashMap();

        for (int i = 0; i < number; i++) {
            String word = scan.nextLine();
            String synonym = scan.nextLine();

            if (!wordSynonyms.containsKey(word)){
                wordSynonyms.put(word, new ArrayList<>());
            }

            wordSynonyms.get(word).add(synonym);
        }
        for (Map.Entry<String, ArrayList<String>> entry : wordSynonyms.entrySet()) {

            System.out.printf("%s - %s%n", entry.getKey(),
                    String.join(", ", entry.getValue()));
        }
    }
}
