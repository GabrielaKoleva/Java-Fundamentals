import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class LegendaryItemGame_07 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Initialize a map to store the count of each material
            Map<String, Integer> materials = new LinkedHashMap<>();
            materials.put("shards", 0);
            materials.put("fragments", 0);
            materials.put("motes", 0);

            // Initialize a map to store the count of junk items
            Map<String, Integer> junkItems = new LinkedHashMap<>();

            // Keep track of whether we have obtained a legendary item
            boolean obtainedLegendaryItem = false;
            String legendaryItem = "";

            while (!obtainedLegendaryItem) {
                String[] input = scanner.nextLine().split("\\s+");
                for (int i = 0; i < input.length; i += 2) {
                    int quantity = Integer.parseInt(input[i]);
                    String material = input[i + 1].toLowerCase();

                    if (materials.containsKey(material)) {
                        // If the material is a key material, add the quantity to its count
                        materials.put(material, materials.get(material) + quantity);

                        // Check if we have obtained a legendary item
                        if (materials.get(material) >= 250) {
                            obtainedLegendaryItem = true;
                            switch (material) {
                                case "shards":
                                    legendaryItem = "Shadowmourne";
                                    break;
                                case "fragments":
                                    legendaryItem = "Valanyr";
                                    break;
                                case "motes":
                                    legendaryItem = "Dragonwrath";
                                    break;
                            }
                            // Reduce the count of the material by 250 to get the remaining count
                            materials.put(material, materials.get(material) - 250);
                            break;
                        }
                    } else {
                        // If the material is a junk item, add it to the junkItems map
                        if (!junkItems.containsKey(material)) {
                            junkItems.put(material, quantity);
                        } else {
                            junkItems.put(material, junkItems.get(material) + quantity);
                        }
                    }
                }
            }

            // Print the obtained legendary item
            System.out.println(legendaryItem + " obtained!");

            // Print the remaining key materials
            for (Map.Entry<String, Integer> entry : materials.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }

            // Print the junk items
            for (Map.Entry<String, Integer> entry : junkItems.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
}
