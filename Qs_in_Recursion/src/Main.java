public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        funRev(5);
    }

    static void fun(int n){
        if(n == 0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }

    static void funRev(int n){
        if(n == 0){
            return;
        }
        funRev(n-1);
        System.out.println(n);
    }
}