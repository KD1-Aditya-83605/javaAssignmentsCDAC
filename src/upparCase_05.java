import java.util.Scanner;

public class upparCase_05 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string:");
        String input = scanner.nextLine();
        scanner.close();


        int  uppercaseC = 0;
        int lowercaseC = 0;
        int digitC = 0;
        int otherC = 0;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (Character.isUpperCase(ch)) {
                uppercaseC++;
            } else if (Character.isLowerCase(ch)) {
                lowercaseC++;
            } else if (Character.isDigit(ch)) {
                digitC++;
            } else {
                digitC++;
            }
        }

        System.out.println("Uppercase : " + uppercaseC);
        System.out.println("Lowercase : " + lowercaseC);
        System.out.println("Digits: " + digitC);
        System.out.println("Other   : " + otherC);
    }
}
