import org.apache.xalan.xsltc.cmdline.Compile;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * Created by jackli on 6/15/2015.
 */
public class Three_2<E extends Comparable<E>>{

    List<E> stack;
    Stack<E> mins;
    int top;
    int size;



    public Three_2(){
        stack = new LinkedList<>();
        stack.add(null);
        size = 0;
        top = 0;
        mins = new Stack<>();
    }

    public boolean empty(){
        return size==0;
    }

    public E push (E item){
        top++;
        size++;
        stack.add(top, item);
        if (mins.size() == 0 || mins.peek().compareTo(item) > 0 ){
            mins.push(item);
        }
        return item;
    }

    public E pop(){
        size--;
        E e = stack.remove(top);
        if (mins.peek().compareTo(e) == 0){
            mins.pop();
        }
        top--;
        return e;
    }


    public E peek(){
        return stack.get(top);
    }

    public E min(){
        return mins.peek();
    }
}
