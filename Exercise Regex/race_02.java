import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class race_02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String names = scan.nextLine();
        List<String> racerNames = Arrays.stream(names.split(", "))
                .collect(Collectors.toList());

        Map<String, Integer> racerDistance = new LinkedHashMap<>();

        racerNames.forEach(racer -> racerDistance.put(racer, 0));

        String regexLetter = "[A-Za-z]+";
        Pattern patternLetter = Pattern.compile(regexLetter);

        String regexDistance = "[0-9]+";
        Pattern patternDistance = Pattern.compile(regexDistance);

        String input = scan.nextLine();
        while (!input.equals("end of race")){
            StringBuilder nameBuilder = new StringBuilder();
            Matcher matcherLetter = patternLetter.matcher(input);

            while (matcherLetter.find()){
                nameBuilder.append(matcherLetter.group());
            }

            int distance = 0;
            Matcher matcherDistance = patternDistance.matcher(input);
            while (matcherDistance.find()){
                distance += Integer.parseInt(matcherDistance.group());
            }
            String nameOfRacer = nameBuilder.toString();
            if (racerNames.contains(nameOfRacer)){
                int currentDistance = racerDistance.get(nameOfRacer);
                racerDistance.put(nameOfRacer, currentDistance + distance);
            }
            input = scan.nextLine();
        }
        for (int index = 0; index <= 2; index++) {
            String racer = racerNames.get(index);
            if (index == 0){
                System.out.printf("1st place: %s%n", racer);
            }else if (index == 1){
                System.out.printf("2nd place: %s%n", racer);
            }else if (index == 2){
                System.out.printf("3rd place: %s", racer);
            }
        }
    }
}

