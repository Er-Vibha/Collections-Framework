import java.util.HashSet;

public class Test_HashSet {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(12);
        set.add(34);
        set.add(45);
        set.add(32);
        set.add(14);
        System.out.println(set.size());
        System.out.println(set.contains(34));
        System.out.println(set);
        System.out.println(set.hashCode());
        System.out.println(set.spliterator());
    }
}
