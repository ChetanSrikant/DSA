public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int n = 69;
        System.out.println(isOdd(n));
    }

    static boolean isOdd(int n){
        return (n&1) == 1;
    }
}