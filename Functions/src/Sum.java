import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
//        Sum();
//        int ans = sum2();

        int ans = sum3(5, 10 );
        System.out.println(ans);

    }

    static int sum3(int a, int b){
        int c = a+ b;

        return c;
    }

    static int sum2(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1st no.");
        int a = in.nextInt();

        System.out.println("Enter 2nd no.");
        int b = in.nextInt();

        int c = a + b;

        return c;
    }
    static void Sum(){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter 1st no.");
        int a = in.nextInt();

        System.out.println("Enter 2nd no.");
        int b = in.nextInt();

        int c = a + b;

        System.out.println("The sum of 2 no's is: " + c);
    }
}
