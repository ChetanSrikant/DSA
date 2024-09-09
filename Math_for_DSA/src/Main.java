public class Main {
    public static void main(String[] args) {
        int n = 15;
        for (int i = 0; i < n; i++) {
            boolean ans = isPrime(i);
            System.out.println(i + " is " + ans);
        }
    }

    static boolean isPrime(int n){

        if(n<=1){
            return false;
        }

        int c = 2;

        while (c*c <= n){
            if(n%c == 0){
                return false;
            }
            c++;
        }
        return true;
    }
}