import java.util.*;

public class oddOccurrences_03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] wordsArr = scan.nextLine().split(" ");

        LinkedHashMap<String, Integer> wordMap = new LinkedHashMap<>();
        for (String currentWord : wordsArr) {
            currentWord = currentWord.toLowerCase();

            if (!wordMap.containsKey(currentWord)){
                wordMap.put(currentWord, 1);
            }else {
                int value = wordMap.get(currentWord);
                wordMap.put(currentWord, value + 1);
            }
        }

        List<String> resultList = new ArrayList<>();
        for (Map.Entry<String, Integer>entry:wordMap.entrySet()){
            if (entry.getValue() % 2 != 0){
                resultList.add(entry.getKey());
            }
        }
        System.out.println(String.join(", ", resultList));
    }
}
