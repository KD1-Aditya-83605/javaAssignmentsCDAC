import java.awt.*;
import java.util.Scanner;

public class MaxNo_01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = scanner.nextInt();
        int[]arr  = new int[size];
        System.out.println("Enter the numbers");
        for (int i = 0 ;i< arr.length;i++){
            int num = scanner.nextInt();
            arr[i] = num;
        }

        int max = Integer.MIN_VALUE;
        for (int i = 0 ;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }

        System.out.println("Maximum number is: "+max);


    }
}
