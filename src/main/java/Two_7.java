import java.util.Stack;

/**
 * Created by jackli on 6/18/2015.
 */
public class Two_7 {

    public static boolean isPal (Node node){
        int length = 0;
        Node t = node;
        while (t != null){
            length++;
            t = t.next;
        }

        Node left = node;
        for (int i = 0; i < length/2; i++) {
            int valL = left.value;
            Node right = left;
            for (int j = 0; j < length-(2*i)-1; j++) {
                right = right.next;
            }
            int valR = right.value;
            if (valL != valR){
                return false;
            }
            left = left.next;
        }

        return true;
    }

    public static boolean isPal2 (Node node){
        Node slow = node;
        Node fast = node;

        Stack<Integer> stack = new Stack<>();

        while (fast != null && fast.next!= null){
            stack.push(slow.value);
            slow = slow.next;
            fast = fast.next.next;
        }

        if (fast != null){
            slow = slow.next;
        }

        while (!stack.isEmpty()){
            if (stack.pop() != slow.value){
                return false;
            }
            slow = slow.next;
        }

        return true;
    }
}
