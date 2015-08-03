/**
 * Created by jackli on 6/15/2015.
 */
public class test32 {
    public static void main(String[] args) {
//        Three_2<Integer>  as = new Three_2<>();
//
//        System.out.println(as.size);
//        as.push(1);
//        as.push(2);
//        as.push(3);
//        as.push(4);
//        as.push(-1);
//        as.pop();
//        as.pop();
//        as.push(1000);
//        as.push(-1000);
//        System.out.println(as.empty());
//        System.out.println(as.size);
//        System.out.println(as.min());

        Node a = new Node();
        Node b = new Node();
        Node c = new Node();
        Node d = new Node();
        Node e = new Node();

        a.value = 9;
        b.value = 8;
        c.value = 82;
        d.value = 8;
        e.value = 9;

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        Node a1 = new Node();
        Node b1 = new Node();
        Node c1 = new Node();
        Node d1 = new Node();
        Node e1 = new Node();

        a1.value = 1;
        b1.value = 0;
        c1.value = 7;
        d1.value = 6;
        e1.value = 1;

        a1.next = b1;
        b1.next = c1;
        c1.next = d1;
        d1.next = e1;

        System.out.println("\n\n");
//        Node t1 = Two_5.addR(a, a1, 0);

        System.out.println(Two_7.isPal2(a));
//        System.out.println(nodeToString(t1));
////        Two_5.reverse(t1);
//        System.out.println(nodeToString(t1));
}

    public static String nodeToString(Node t){
        StringBuilder sb = new StringBuilder();
        while (t!= null){
            sb.append(t.value);
            t = t.next;
        }

        return sb.toString();
    }
}
