import java.util.*;

public class forceBook_09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, List<String>> forceSides = new LinkedHashMap<>();

        String input = scan.nextLine();
        while (!input.equals("Lumpawaroo")) {
            String[] tokens = input.split("\\s+\\|\\s+|\\s+->\\s+");
            String forceSide = tokens[0];
            String forceUser = tokens[1];

            if (input.contains("|")) {
                if (!forceSides.containsKey(forceSide)) {
                    forceSides.put(forceSide, new ArrayList<>());
                }
                if (!forceSides.values().stream().anyMatch(l -> l.contains(forceUser))) {
                    forceSides.get(forceSide).add(forceUser);
                }
            } else {
                boolean userExists = false;
                String previousSide = "";
                for (Map.Entry<String, List<String>> entry : forceSides.entrySet()) {
                    String side = entry.getKey();
                    List<String> users = entry.getValue();
                    if (users.contains(forceUser)) {
                        userExists = true;
                        previousSide = side;
                        break;
                    }
                }
                if (!userExists) {
                    if (!forceSides.containsKey(forceSide)) {
                        forceSides.put(forceSide, new ArrayList<>());
                    }
                    forceSides.get(forceSide).add(forceUser);
                    System.out.println(forceUser + " joins the " + forceSide + " side!");
                } else {
                    forceSides.get(previousSide).remove(forceUser);
                    if (!forceSides.containsKey(forceSide)) {
                        forceSides.put(forceSide, new ArrayList<>());
                    }
                    forceSides.get(forceSide).add(forceUser);
                    System.out.println(forceUser + " joins the " + forceSide + " side!");
                }
            }

            input = scan.nextLine();
        }

        forceSides.entrySet().stream()
                .sorted((a, b) -> {
                    int cmp = Integer.compare(b.getValue().size(), a.getValue().size());
                    if (cmp == 0) {
                        cmp = a.getKey().compareTo(b.getKey());
                    }
                    return cmp;
                })
                .forEach(entry -> {
                    String forceSide = entry.getKey();
                    List<String> forceUsers = entry.getValue();
                    if (!forceUsers.isEmpty()) {
                        System.out.println("Side: " + forceSide + ", Members: " + forceUsers.size());
                        forceUsers.stream()
                                .sorted()
                                .forEach(u -> System.out.println("! " + u));
                    }
                });
    }
}
