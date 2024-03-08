import java.util.Scanner;


class Student {
    private String studentName;
    private String rollNo;
    private int totalMarks;

    public Student(String studentName, String rollNo, int totalMarks) {
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.totalMarks = totalMarks;
    }

    public String getStudentName() {
        return studentName;
    }

    public String getRollNo() {
        return rollNo;
    }

    public int getTotalMarks() {
        return totalMarks;
    }
}

public class studentClass_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        boolean addMoreStd = true;

        while (addMoreStd) {
            System.out.print("Enter student name: ");
            String studentName = scanner.nextLine();

            System.out.print("Enter roll number: ");
            String rollNo = scanner.nextLine();

            System.out.print("Enter total marks obtained: ");
            int totalMarks = scanner.nextInt();
            scanner.nextLine();

            Student student = new Student(studentName, rollNo, totalMarks);

            System.out.println("Student Detail:");
            System.out.println("Name: " + student.getStudentName());
            System.out.println("Roll Number: " + student.getRollNo());
            System.out.println("Total Marks Obtained: " + student.getTotalMarks());

            System.out.print("Do you want to add more student: ");
            String choice = scanner.nextLine();
            addMoreStd = choice.equalsIgnoreCase("yes");
        }
    }
}


