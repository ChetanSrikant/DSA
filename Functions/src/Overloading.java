public class Overloading {
    public static void main(String[] args) {
        fun(40);
        fun("Chetan");
    }

    static void fun(int a){
        System.out.println(a);
    }

    static void fun(String a){
        System.out.println(a);
    }

}
