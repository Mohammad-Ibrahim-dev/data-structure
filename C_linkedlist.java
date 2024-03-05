import java.util.LinkedList;
import java.util.Collections;
// collection framework
public class C_linkedlist {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(6);
        list.add(5);
        list.add(22);
        System.out.println(list.get(2));
        System.out.println(list);
        System.out.println(list.get(0));      
        list.add(2,100);
        list.addFirst(90);
        list.addLast(786);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.contains(6));
        list.set(0, 786);
        System.out.println(list);
        System.out.println(list.size());
        Collections.sort(list );
        System.out.println(list);
       //list.removeAll(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
}
