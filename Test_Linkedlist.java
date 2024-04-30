import java.util.LinkedList;

public class Test_Linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> a=new LinkedList<>();
        LinkedList<Integer> b=new LinkedList<>();
        a.add(4);
        a.add(9);
        a.add(3);
        a.add(7);
        a.add(5);
        b.add(12);
        b.add(11);
        b.add(17);
        b.add(15);
        System.out.println(a.addAll(b));
        System.out.println(a);
        System.out.println(a.get(4));
        System.out.println(a.size());
        System.out.println(a.contains(45));
        a.addFirst(2);
        a.addLast(22);
        System.out.println("After adding "+a);
        System.out.println(a.element());
        a.removeFirst();
        a.removeLast();
        System.out.println("After removing "+a);
        a.set(3,8);
        System.out.println("After Setting"+a);
        a.pop();
        a.push(7);
    }
}
