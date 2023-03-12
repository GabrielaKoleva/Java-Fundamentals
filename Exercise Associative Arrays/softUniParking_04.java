import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class softUniParking_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Map<String, String> parking = new LinkedHashMap<>();

        int n = Integer.parseInt(scan.nextLine());
        for (int i = 0; i < n; i++) {
            String [] input = scan.nextLine().split("\\s+");
            String command = input[0];
            String userName = input[1];

            if (command.equals("register")){
                String license = input[2];
                if (parking.containsKey(userName)){
                    System.out.printf("ERROR: already registered with plate number %s%n"
                            , parking.get(userName));
                }else {
                    parking.put(userName, license);
                    System.out.printf("%s registered %s successfully%n",
                            userName, license);
                }
            }else if (command.equals("unregister")){
                if (parking.containsKey(userName)){
                    System.out.printf("%s unregistered successfully%n", userName);
                    parking.remove(userName);
                }else {
                    System.out.printf("ERROR: user %s not found%n", userName);
                }
            }
        }

        parking.entrySet().forEach(entry->{
            String username = entry.getKey();
            String license = entry.getValue();
            System.out.printf("%s => %s%n", username, license);
        });
    }
}
