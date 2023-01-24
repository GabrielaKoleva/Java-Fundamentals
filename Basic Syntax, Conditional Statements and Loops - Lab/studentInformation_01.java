import java.util.Scanner;

public class studentInformation_01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String studentName = scan.nextLine();
        int age = Integer.parseInt(scan.nextLine());
        double studentGrade = Double.parseDouble(scan.nextLine());

        String result = String.format("Name: %s, Age: %d, Grade: %.2f", studentName,age,studentGrade);

        //String gggg = "I'm IT specialist";
        System.out.println(result); //+ gggg);

        String line = scan.nextLine();
        int i = Integer.parseInt(line);

    }
}
