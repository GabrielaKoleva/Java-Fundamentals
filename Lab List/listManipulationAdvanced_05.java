import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class listManipulationAdvanced_05 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Integer> inputNumbers = Arrays
                .stream(scan.nextLine().split(" "))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = scan.nextLine();

        while (!command.equals("end")){

            if (command.startsWith("Contains")){
                int checkNumber = Integer.parseInt(command.split(" ")[1]);
                printContainsNumber(inputNumbers, checkNumber);
            }else if (command.equals("Print even")){
                printEvenNumber(inputNumbers);
                System.out.println();
            }else if (command.equals("Print odd")){
                printOddNumbers(inputNumbers);
                System.out.println();
            }else if (command.equals("Get sum")){
                printSum(inputNumbers);
            }else if (command.contains("Filter")){
                String condition = command.split(" ")[1];
                int numberToFilter = Integer.parseInt(command.split(" ")[2]);
                printFilterNumbers(inputNumbers,condition,numberToFilter);
                System.out.println();
            }
            command = scan.nextLine();
        }
    }

    public static void printContainsNumber(List<Integer> inputNumbers,int checkNumber) {
        if (inputNumbers.contains(checkNumber)){
            System.out.println("Yes");
        }else {
            System.out.println("No such number");
        }
    }

    public static void printFilterNumbers(List<Integer> inputNumbers,String condition,int numberToFilter) {
        switch (condition){
            case "<":
                for (int number:inputNumbers) {
                    if (number < numberToFilter){
                        System.out.print(number + " ");
                    }
                }
                break;
            case ">":
                for (int number:inputNumbers) {
                    if (number > numberToFilter){
                        System.out.print(number + " ");
                    }
                }
                break;
            case "<=":
                for (int number:inputNumbers) {
                    if (number <= numberToFilter){
                        System.out.print(number + " ");
                    }
                }
                break;
            case ">=":
                for (int number:inputNumbers) {
                    if (number >= numberToFilter){
                        System.out.print(number + " ");
                    }
                }
                break;
        }
    }

    public static void printSum(List<Integer> inputNumbers) {
        int sum = 0;
        for (int number:inputNumbers) {
            sum += number;
        }
        System.out.println(sum);
    }

    public static void printOddNumbers(List<Integer> inputNumbers) {
        for (int number:inputNumbers) {
            if (number % 2 != 0){
                System.out.print(number + " ");
            }
        }
    }

    public static void printEvenNumber(List<Integer> inputNumbers) {
        for (int number:inputNumbers) {
            if (number % 2 == 0){
                System.out.print(number + " ");
            }
        }
    }
}
