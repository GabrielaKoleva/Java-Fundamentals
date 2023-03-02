import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class students_05 {

    static class Students{
        String firstName;
        String secondName;
        String age;
        String town;

        public Students(String firstName, String secondName, String age, String town){
            this.firstName = firstName;
            this.secondName = secondName;
            this.age = age;
            this.town = town;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getSecondName() {
            return secondName;
        }

        public String getAge() {
            return age;
        }

        public String getTown() {
            return town;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input = scan.nextLine();

        List<Students> studentsList = new ArrayList();

        while (!input.equals("end")){
            String[] studentsInformation = input.split("\\s+");
            Students students = new Students(studentsInformation[0],studentsInformation[1],
                    studentsInformation[2],studentsInformation[3]);
            studentsList.add(students);

            input = scan.nextLine();
        }
        String currentTown = scan.nextLine();
        for (Students item:studentsList) {
            if (item.getTown().equals(currentTown)) {
                System.out.printf("%s %s is %s years old%n", item.getFirstName(),
                        item.getSecondName(), item.age);
            }
        }
    }
}
