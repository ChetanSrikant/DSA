public class LCM {
    public static void main(String[] args) {
        int ans =  lcm(2,7);
        System.out.println(ans);
    }

    static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }

    static int lcm(int a , int b){
        int d = gcd(a,b);

        return a*b/d;
    }
}