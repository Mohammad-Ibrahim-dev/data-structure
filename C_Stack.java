import java.util.Stack;

public class C_Stack {
    public static void main(String[] args) {
        Stack<String> list= new Stack<>();
        list.push("apple");
        list.push("banana");
        System.out.println(list);
        list.add("orange");
        list.add("papaya");
        System.out.println(list);
        list.pop();
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println(list.peek());
    }
}