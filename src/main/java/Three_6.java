import java.util.Stack;

/**
 * Created by jackli on 6/16/2015.
 */
public class Three_6 {

    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();

        a.push(2);
        a.push(1);
        a.push(6);
        a.push(100);
        a.push(5);
        a.push(3);

        System.out.println(a);
        Stack<Integer> b = new Stack<>();
        sort(a, b);
        System.out.println(b);
    }
    public static void sort(Stack<Integer> s1, Stack<Integer> s2){
        while (!s1.empty()) {
            Integer t = s1.pop();
            while (!s2.isEmpty() && t < s2.peek()) {
                s1.push(s2.pop());
            }
            s2.push(t);

        }
    }
}
