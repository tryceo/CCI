import java.util.Stack;

/**
 * Created by jackli on 6/16/2015.
 */
public class Three_5 {

    Stack<Integer> top;
    Stack<Integer> bot;

    public void enqueue(Integer integer){
        if (top.size() ==0){
            transferBotToTop();
        }
        top.push(integer);
    }

    public Integer dequeue(){
        transferTopToBot();
        return bot.pop();
    }

    private void transferTopToBot(){
        for (int i = 0; i < top.size(); i++) {
            bot.push(top.pop());
        }
    }

    private void transferBotToTop(){
        for (int i = 0; i < bot.size(); i++) {
            top.push(bot.pop());
        }
    }
}
