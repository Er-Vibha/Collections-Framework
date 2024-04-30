import java.util.ArrayList;

public class Test_Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>(4);
        //Using Add function
        b.add(67);
        b.add(23);
        b.add(56);
        b.add(5);
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        //Using Remove function
        a.remove(2);
        //Using Add function
        a.addAll(0, b);
        //Using Set function
        a.set(1, 45);
        //Using Equals function
        System.out.println(a.equals(b));
        System.out.println(a.contains(4));
        System.out.println("Index of 2 is:" + a.indexOf(2));
        System.out.println("Index of 123 is:" + a.indexOf(123));
        System.out.println("Index of 5 is:" + a.indexOf(5));
        System.out.println("Getting last index of 5:" + a.lastIndexOf(5));
        System.out.println(a);
        for (Integer integer : a) {
            System.out.println(integer);
        }
        //Using Clear
        a.clear();
        System.out.println(a);
    }
}
