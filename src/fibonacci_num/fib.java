package fibonacci_num;

import java.util.Scanner;

public class fib {
    public static void main(String[] args) {
        System.out.println("Enter your number: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        int ans = 0;
        for(int i = 1; i<num;i++){
              ans = a + b;
             a = b;
             b = ans;
        }
        System.out.println(ans);
    }
}
