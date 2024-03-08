import java.util.Scanner;

public class factorial_02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for which you want to find factorial");
        int num = scanner.nextInt();
        int ans = fact(num);
        System.out.println("Factorial of "+num+"is "+ans);


    }

    static int fact(int num){
        if(num == 0 ){
            return 1;
        }
       return num* fact(num-1);
    }
}
