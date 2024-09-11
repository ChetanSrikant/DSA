public class Reverse {
    static int sum = 0;
    public static void main(String[] args) {
//        int ans = Reverse(1234);

        rev(123);

        System.out.println(sum);
    }


    static int Reverse(int n){
        int Sum = 0;

        while (n > 0){
           int rem = n%10;

           Sum = Sum*10+rem;

           n = n/10;
        }

        return Sum;
    }



    static void rev(int n){

        if(n%10==0){
            return ;
        }

        int rem = n%10;

        sum = sum*10+rem;

        rev(n/10);
    }
}
