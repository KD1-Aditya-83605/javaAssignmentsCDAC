import java.util.Scanner;

public class table_07 {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter the number for which you want to display the table: ");
            int number = scanner.nextInt();

            System.out.println("Table of " + number + ":");
            displayTable(number);
        }

        static void displayTable(int number) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(number + " x " + i + " = " + (number * i));
            }
        }
    }

