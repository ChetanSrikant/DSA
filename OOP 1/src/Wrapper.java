public class Wrapper {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        Integer num = 45;

        swap(a,b); 
    }

    static void swap(int a, int b){
        int temp =a;
        a = b;
        b = temp;
    }
}
