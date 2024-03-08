import java.util.Scanner;

public class grades_04 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Enter marks of five subjects:");
            int[] marks = new int[5];
            for (int i = 0; i < 5; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = scanner.nextInt();
            }

            int totalMarks = calculateTotalMarks(marks);
            char grade = calculateGrade(totalMarks);

            System.out.println("Total Marks obtained: " + totalMarks);
            System.out.println("Your Grade is : " + grade);
        }

        static int calculateTotalMarks(int[] marks) {
            int total = 0;
            for (int mark : marks) {
                total += mark;
            }
            return total;
        }

        static char calculateGrade(int totalMarks) {
            if (totalMarks >= 90) {
                return 'E';
            } else if (totalMarks >= 80) {
                return 'A';
            } else if (totalMarks >= 70) {
                return 'B';
            } else if (totalMarks >= 60) {
                return 'C';
            } else {
                return 'F';
            }
        }
    }

