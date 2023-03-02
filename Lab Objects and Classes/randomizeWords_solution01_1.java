import java.sql.Array;
import java.util.Random;
import java.util.Scanner;

public class randomizeWords_solution01_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

//Разделяме входния низ на масив от думи с помощта на метода split(). Предаваме регулярен израз на split(), за да разделим низа на един или повече интервали (\\s+).
//Създаваме нов клас Random за генериране на произволни числа.
//Използваме for цикъл, за да преминем през всеки елемент в масива arrayWords.
//За всеки елемент генерираме два произволни индекса в границите на масива и разменяме елементите при тези индекси.
//Накрая отпечатваме рандомизирания масив от думи с помощта на метода join().
//Предаваме System.lineSeparator() като разделител за отпечатване на всяка дума на отделен ред.

        String input = scan.nextLine();
        String[] arrayWords = input.split("\\s+");

        Random random = new Random();
        for (int i = 0; i < arrayWords.length; i++) {

            int indexOne = random.nextInt(arrayWords.length);
            int indexTwo = random.nextInt(arrayWords.length);

            String currentWord = arrayWords[indexOne];
            arrayWords[indexOne] = arrayWords[indexTwo];
            arrayWords[indexTwo] = currentWord;
        }
        System.out.println(String.join(System.lineSeparator(), arrayWords));
    }
}
