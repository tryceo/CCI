import java.util.LinkedList;

/**
 * Created by jackli on 6/17/2015.
 */
public class Two_1 {

    public class Node{
        public int value;
        public Node next;

        public Node(){
            super();
        }
    }

    public static void deleteDups(Node node){
        Node next = node;
        while (next!= null){
            Node runner = next;
            while (runner.next!=null){
                if (runner.next.value == next.value){
                    runner.next = runner.next.next;

                }else {
                    runner = runner.next;
                }
            }
            next = next.next;
        }
    }

}
