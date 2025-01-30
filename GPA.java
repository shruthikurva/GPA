    import java.util.Scanner;
    public class GPA {
         public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int subjects;
        double totalPoints = 0, totalCredits = 0;

        System.out.print("Enter number of subjects: ");
        subjects = scanner.nextInt();

        for (int i = 0; i < subjects; i++) {
            System.out.print("Enter grade (A, B, C, D, F) for subject " + (i + 1) + ": ");
            char grade = scanner.next().toUpperCase().charAt(0);

            System.out.print("Enter credit hours for subject " + (i + 1) + ": ");
            double credits = scanner.nextDouble();

            totalPoints += getGradePoints(grade) * credits;
            totalCredits += credits;
        }

        double gpa = totalPoints / totalCredits;
        System.out.printf("Your GPA is: %.2f%n", gpa);
        scanner.close();
    }

    static double getGradePoints(char grade) {
        return switch (grade) {
            case 'A' -> 4.0;
            case 'B' -> 3.0;
            case 'C' -> 2.0;
            case 'D' -> 1.0;
            case 'F' -> 0.0;
            default -> {
                System.out.println("Invalid grade! Assuming F.");
                yield 0.0;
            }
        };
    }
}

