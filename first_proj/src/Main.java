import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int count =2;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        

        while(count <= n){
            int temp = b;
            b = b+a;
            a = temp;
            count++;
            System.out.println(b);
        }

    }
}