import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class countCharsInString_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String inputText = scan.nextLine();

        Map<Character, Integer> resultText = new LinkedHashMap<>();
        for (Character symbol:inputText.toCharArray()) {
            if (symbol == ' '){
                continue;
            }
            //да сме срещали char-a
            if (resultText.containsKey(symbol)){
                int counterCount = resultText.get(symbol);
                resultText.put(symbol, counterCount + 1);
            }
            //да не сме срещали char-a
            else {
                resultText.put(symbol, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry:resultText.entrySet()){
            System.out.println(entry.getKey() + " -> " +entry.getValue());
        }
    }
}
