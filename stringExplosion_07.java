import java.util.Scanner;

public class stringExplosion_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();
//Създавам нов обект от тип StringBuilder, който съдържа същия низ като входа (input).
        StringBuilder output = new StringBuilder(input);
        int strength = 0;

        for (int position = 0; position < output.length(); position++) {
//обработвам на дадената позиция символът от цикъла.
            char currentChar = output.charAt(position);
//проверявам дали текущия символ е ">", като се извлича силата на атаката
// и се добавя към strength.
            if (currentChar == '>') {
//извличане силата на атаката, като се вземе следващият символ след ">"
// и се конвертира към цяло число.
                int attackStrength = Integer.parseInt(output.charAt(position + 1) + "");
                strength += attackStrength;
            } else if (currentChar != '>' && strength > 0) {
//с deleteCharAt изтривам текущия символ.
                output.deleteCharAt(position);
                strength--;
                position--;
            }
        }

        System.out.println(output);
    }
}
