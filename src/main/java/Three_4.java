import java.util.Stack;

/**
 * Created by jackli on 6/15/2015.
 */
public class Three_4 {

    public static void main(String[] args) {
        Stack<Integer> a = new Stack<>();
        a.push(3);
        a.push(2);
        a.push(1);
        Stack<Integer> b = new Stack<>();
        Stack <Integer> c = new Stack<>();
        System.out.println(a.toString());
        moveDisks(3, a, b, c);
        System.out.println(a.toString());
        System.out.println(c.toString());
    }

    public static void moveDisks(int n, Stack<Integer> a, Stack<Integer> b, Stack<Integer> c){

        if (n>0){
            moveDisks(n-1, a, c, b);
            if (c.empty() || c.peek() > a.peek()){
                c.push(a.pop());
            }
            moveDisks(n-1, b, a, c);
        }
    }
}
