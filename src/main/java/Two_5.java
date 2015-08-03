/**
 * Created by jackli on 6/17/2015.
 */
public class Two_5 {

    public static Node add(Node a , Node b){
        Node result = new Node();

        Node begin = result;
        int carry = 0;
        while (a!= null || b!= null){
            int total;
            if (a == null) {
                total = b.value + carry;
                b = b.next;
            }else if (b == null){
                total = a.value + carry;
                a = a.next;
            } else {
                total = a.value + b.value + carry;
                a = a.next;
                b = b.next;
            }

            carry = 0;
            if (total >= 10){
                total -= 10;
                carry = 1;
            }

            result.value = total;
            if (a!= null || b != null || carry != 0) {
                result.next = new Node();
                result = result.next;
            }
        }
        if (carry == 1){
            result.value = 1;
        }
        return begin;
    }

    public static Node addR (Node a , Node b, int carry){
        if (a == null && b == null && carry == 0){
            return null;
        }

        int total = carry;
        if (a != null){
            total += a.value;
        }
        if (b!= null){
            total += b.value;
        }

        carry  = 0;
        if (total >=10){
            carry = 1;
            total -= 10;
        }

        Node result = new Node();
        result.value = total;
        result.next = addR(a == null? null :a.next, b == null? null:b.next, carry);

        return result;
    }

    public static Node reverse (Node node){

        Node prev = null;
        Node current = node;

        while (current!=null){
            Node next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }

        return prev;
    }
}
