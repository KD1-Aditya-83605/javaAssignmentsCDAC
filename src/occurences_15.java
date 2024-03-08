import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class occurences_15 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Enter a string: ");
            String input = scanner.nextLine();

            Map<Character, Integer> charCount = countAlphabetOccurrences(input);

            System.out.println("Occurrences of each alphabet (case-insensitive):");
            for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }

        static Map<Character, Integer> countAlphabetOccurrences(String str) {
            Map<Character, Integer> charCount = new HashMap<>();
            str = str.toLowerCase();

            for (char c : str.toCharArray()) {
                if (Character.isLetter(c)) {
                    charCount.put(c, charCount.getOrDefault(c, 0) + 1);
                }
            }

            return charCount;
        }
    }


