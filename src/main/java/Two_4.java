/**
 * Created by jackli on 6/17/2015.
 */
public class Two_4 {



    public static void partitionList(Node node, int x){

        Node begin = null;
        Node low = null;
        Node high = null;
        Node mid = null;


        Node current = node;

        while (current != null){

            if (current.value < x){
                if (low == null){
                    low = current;
                    begin = low;
                }else{
                    low.next = current;
                    low = low.next;
                }
            }else {
                if (high == null){
                    high = current;
                    mid = high;
                }else {
                    high.next = current;
                    high = high.next;
                }
            }
            current = current.next;
        }

        if (low == null){
            return;
        }
        low.next = mid;
        node.value = begin.value;
        node.next = begin.next;

    }
}
