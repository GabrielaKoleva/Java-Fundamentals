import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class legendaryFarming_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, Integer> materials = new LinkedHashMap<>();
        materials.put("shards", 0);
        materials.put("fragments", 0);
        materials.put("motes", 0);

        Map<String, Integer> junk = new LinkedHashMap<>();

        boolean isWin = false;

        while (!isWin) {
            String input = scan.nextLine();
            String[] inputData = input.split("\\s+");

            for (int index = 0; index <= inputData.length - 1; index += 2) {
                int quantity = Integer.parseInt(inputData[index]);
                String currentMaterial = inputData[index + 1].toLowerCase();

                if (currentMaterial.equals("shards") || currentMaterial.equals("fragments")
                        || currentMaterial.equals("motes")) {
                    int currentQuantity = materials.get(currentMaterial);
                    materials.put(currentMaterial, quantity + currentQuantity);
                } else {
                    if (!junk.containsKey(currentMaterial)) {
                        junk.put(currentMaterial, quantity);
                    } else {
                        int quantityOfTrash = junk.get(currentMaterial);
                        junk.put(currentMaterial, quantity + quantityOfTrash);
                    }
                }
                if (materials.get("shards") >= 250) {
                    System.out.println("Shadowmourne obtained!");
                    materials.put("shards", materials.get("shards") - 250);
                    isWin = true;
                    break;
                } else if (materials.get("fragments") >= 250) {
                    System.out.println("Valanyr obtained!");
                    materials.put("fragments", materials.get("fragments") - 250);
                    isWin = true;
                    break;
                } else if (materials.get("motes") >= 250) {
                    System.out.println("Dragonwrath obtained!");
                    materials.put("motes", materials.get("motes") - 250);
                    isWin = true;
                    break;
                }
            }
        }
            materials.entrySet().forEach(entry -> System.out.printf("%s: %d%n",
                    entry.getKey(), entry.getValue()));

            junk.entrySet().forEach(entry -> System.out.printf("%s: %d%n",
                    entry.getKey(), entry.getValue()));
    }
}
