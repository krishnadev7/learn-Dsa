import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your rollNo.: ");
        Scanner input = new Scanner(System.in);
        int rollno = input.nextInt();
        System.out.println("Your roll No. is: " + rollno);
    }
}