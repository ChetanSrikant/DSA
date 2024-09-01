public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        String a = "Chetan";
        String b = "Chetan";

//        System.out.println(a == b);

        String name1 = new String("Chetan");
        String name2 = new String("Chetan");

        System.out.println(name1 == name2);

        System.out.println(name1.charAt(0));

        float x = 4.56217f;
        System.out.printf("Formatted to %.2f", x);

        System.out.printf("Well this is %s and let look %s","Interesting", "Deeper");

    }
}