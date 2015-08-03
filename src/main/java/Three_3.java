import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by jackli on 6/15/2015.
 */
public class Three_3<E extends Comparable<E>>{

    List<Stack<E>> stacks = new ArrayList<>();
    int stackNum;

    int thresh;

    public Three_3(){
        stacks.add(new Stack<E>());
        thresh = 10;
        stackNum = 0;
    }
    public E pop(){
        if (stacks.get(stackNum).size() == 0 ){
            stacks.remove(stackNum);
            stackNum--;
        }
        return stacks.get(stackNum).pop();
    }

    public void push(E e){
        if (stacks.get(stackNum).size() >= thresh){
            stacks.add(new Stack<E>());
            stackNum++;
        }
        stacks.get(stackNum).push(e);
    }
}
