import java.util.Scanner;

public class reverseString_12 {
    public static String reverseWord(String str)
    {
        char[] ch = str.toCharArray();
        int start  = 0;
        int end = ch.length - 1;

        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String reversed = reverseWord(input);

        System.out.println("Reversed string: " + reversed);
    }
}


