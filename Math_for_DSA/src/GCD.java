public class GCD {
    public static void main(String[] args) {
       int ans =  gcd(99,69);
        System.out.println(ans);
    }

    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
}
