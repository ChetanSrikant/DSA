public class CountZeros {
    public static void main(String[] args) {
        int count = 0;
        int number = 2100080;

        int ans = zeros(number, count);

        System.out.println(ans);
    }

    static int zeros (int n, int c){

        if(n/10 == 0){
            return c;
        }

        if(n%10 == 0){
            c++;
        }

        return zeros(n/10, c);
    }
}
