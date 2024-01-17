import java.util.Scanner;

public class Java_assignment_01 {
    private static int userIdCounter = 1;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.print("Enter your course (Java/Python): ");
            String course = scanner.nextLine();

            String userId = generateUserId(course);

            System.out.println("Your user ID is: " + userId);

            System.out.print("Do you want to continue? (yes/no): ");
            String continueInput = scanner.nextLine().toLowerCase();

            if (!continueInput.equals("yes")) {
                break;
            }

        } while (true);

        scanner.close();
    }

    private static String generateUserId(String course) {
        String lowercaseCourse = course.toLowerCase();

        if (lowercaseCourse.equals("java")) {
            return "java" + userIdCounter++;
        } else if (lowercaseCourse.equals("python")) {
            return "python" + userIdCounter++;
        } else {
            return "InvalidCourse";
        }
    }
}
