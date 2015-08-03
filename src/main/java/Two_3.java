/**
 * Created by jackli on 6/17/2015.
 */
public class Two_3 {
    public class Node{
        public int value;
        public Node next;

        public Node(){
            super();
        }
    }

    public static void deleteNode(Node node){
        Node orig = node;
        orig.value = orig.next.value;
        orig.next = orig.next.next;

    }
}
