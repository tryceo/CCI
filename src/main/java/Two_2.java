/**
 * Created by jackli on 6/17/2015.
 */
public class Two_2 {

    public class Node{
        public int value;
        public Node next;

        public Node(){
            super();
        }
    }
    public static int kthLastInt(Node node, int k){
        Node current = node;
        int count = 0;
        while (current!= null){
            count++;
            current = current.next;
        }

        current = node;
        for (int i = 0; i < count-k-1; i++) {
            current = current.next;
        }

        return current.value;
    }



}
