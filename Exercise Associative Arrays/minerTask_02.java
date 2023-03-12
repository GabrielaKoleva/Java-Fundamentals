import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class minerTask_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Long> resources = new LinkedHashMap<>();

        String input = scan.nextLine();

        while (!input.equals("stop")) {
            long quantity = Long.parseLong(scan.nextLine());
            if (!resources.containsKey(input)) {
                resources.putIfAbsent(input, quantity);
            } else {
                resources.put(input, resources.get(input) + quantity);
            }

            input = scan.nextLine();
        }

        resources.entrySet().forEach(entry -> {
            String res = entry.getKey();
            long quantity = entry.getValue();
            System.out.println(res + " -> " + quantity);
        });
    }
}
