import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine();

        System.out.print("What is your GPA: ");
        double gpa = Double.parseDouble(scanner.nextLine());

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println((gpa > 3.5) ? "Your GPA of " + gpa + " is great." : "Your GPA of " + gpa + "  is good");

        scanner.close();
    }
}