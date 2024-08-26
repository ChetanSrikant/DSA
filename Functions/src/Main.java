import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1st no.");
        int a = in.nextInt();

        System.out.println("Enter 2nd no.");
        int b = in.nextInt();

        int c = a + b;

        System.out.println("The sum of 2 no's is: " + c);
    }
}