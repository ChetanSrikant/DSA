import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");

//        LinkedList<Integer> list= new LinkedList<>();   this is inbuilt form
//        list.add(9);

        LL list = new LL();

        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insert(5,2);

        list.display();

        System.out.println(list.deleteFirst());
        list.display();

        System.out.println(list.deleteLast());
        list.display();

        System.out.println(list.delete(1));
        list.display();
    }
}