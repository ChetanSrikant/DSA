public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("before swapping");

        System.out.println("a:" + a + " "+ "b:"+ b);

//        swap 2 numbers

        int temp;
        temp = a;
        a = b;
        b = temp;

        System.out.println("after swapping ");

        System.out.println("a:" + a +" " + "b:"+ b);
    }
}
