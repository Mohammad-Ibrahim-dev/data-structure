import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
public class framework {
 public static void main(String[] args) {
 List<Integer> list = new ArrayList<>();
 list.add(1);
 list.add(2);
 list.add(3);
 list.add(5);
 list.add(43);
 list.add(76);
 list.add(87);
 list.add(2,23);
 System.out.println(list.get(1));
 System.out.println(list);
 list.remove(1);
 list.remove(Integer.valueOf(23));
 System.out.println(list.size());
 list.set(3, 44);
 System.out.println(list);
 //list.clear();
 //System.out.println(list);
//  System.out.println(list.contains(76));
//  for(Integer i:list)
//  {
//     System.out.println(i);
//  }
Iterator<Integer> it =list.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
}
}