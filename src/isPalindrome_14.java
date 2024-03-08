import java.util.Scanner;

public class isPalindrome_14 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            if (isPalindrome(input)) {
                System.out.println("The string \"" + input + "\" is a palindrome.");
            } else {
                System.out.println("The string \"" + input + "\" is not a palindrome.");
            }
        }

        static boolean isPalindrome(String str) {
            int length = str.length();
            for (int i = 0; i < length / 2; i++) {
                if (str.charAt(i) != str.charAt(length - 1 - i)) {
                    return false;
                }
            }
            return true;
        }
    }


