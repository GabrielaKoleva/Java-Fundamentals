import java.util.Scanner;

public class replaceRepeatingChars_06 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//При стартиране на програмата, тя ще поиска от потребителя да въведе символен низ от конзолата.
//След това програмата ще създаде нов символен низ, в който ще замени
//всяка последователност от еднакви букви със съответстващата им единствена буква.
//За да постигнем това, използваме StringBuilder, който ни позволява
//да конструираме нов символен низ по-ефективно от простото конкатениране на низове.
//Създаваме и променлива lastChar, която пази последната добавена буква към изходния низ.
//При обхождане на входния низ, сравняваме текущата буква с lastChar и ако не съвпадат,
//добавяме текущата буква към изходния низ и променяме стойността на lastChar на текущата буква.

        String input = scan.nextLine();

        String output = replaceDuplicates(input);
        System.out.println(output);
    }

    public static String replaceDuplicates(String input) {
        if (input == null || input.length() == 0) {
            return "";
        }

        StringBuilder result = new StringBuilder();
        char currentChar = input.charAt(0);
        result.append(currentChar);

        for (int i = 1; i < input.length(); i++) {
            char nextChar = input.charAt(i);
            if (nextChar != currentChar) {
                result.append(nextChar);
                currentChar = nextChar;
            }
        }

        return result.toString();
    }
}


