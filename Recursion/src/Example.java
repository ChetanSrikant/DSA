public class Example {
    public static void main(String[] args) {
//        printing numbers for 1 to 5
        numbers(5);
    }
    static void numbers(int n){
        if (n == 5){
            System.out.println(5);
            return;
        }
        System.out.println(n);
        numbers(n+1);
    }
}
