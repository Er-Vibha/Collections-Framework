import java.util.ArrayDeque;

public class Test_Array_Dequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.add(3);
        ad.add(4);
        ad.add(6);
        ad.add(9);
        System.out.println(ad);
        System.out.println(ad.getFirst());
        System.out.println(ad.getLast());
        System.out.println(ad.offerFirst(5));
        System.out.println(ad.offerLast(1));
        System.out.println(ad);
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());
        System.out.println(ad);
        System.out.println(ad.contains(6));
        System.out.println(ad.pop());
        ad.push(7);
        System.out.println(ad);
    }
}
