import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by jackli on 7/8/2015.
 */
public class Test {

    public static void main(String[] args) {
        DefaultMutableTreeNode node = new DefaultMutableTreeNode(1);
        node.insert(new DefaultMutableTreeNode(2), 0);
        node.insert(new DefaultMutableTreeNode(5), 1);
        DefaultMutableTreeNode node1 = (DefaultMutableTreeNode) node.getChildAt(0);
        node1.insert(new DefaultMutableTreeNode(3), 0);
        node1.insert(new DefaultMutableTreeNode(4), 1);
        DefaultMutableTreeNode node11 = (DefaultMutableTreeNode) node.getChildAt(1);
        node11.insert(new DefaultMutableTreeNode(100), 0);
        node11.insert(new DefaultMutableTreeNode(89), 1);

        DefaultMutableTreeNode node2 = (DefaultMutableTreeNode) node1.getChildAt(0);
        node2.insert(new DefaultMutableTreeNode(6), 0);

        System.out.println(depthFirstSearchR(node, 2));
    }


    public static boolean breathFirstSearch(DefaultMutableTreeNode node, int n) {


        LinkedList<DefaultMutableTreeNode> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()){
            DefaultMutableTreeNode temp = queue.pollFirst();

            if ((Integer)temp.getUserObject() == n){
                return true;
            }

            else {
                for (int i = 0; i < temp.getChildCount(); i++) {
                    queue.add((DefaultMutableTreeNode)temp.getChildAt(i));
                }
            }
        }

        return false;
    }

    public static boolean depthFirstSearchR(DefaultMutableTreeNode node, int n){

        if ((Integer) node.getUserObject() == n){
            return true;
        }

        boolean result = false;
        for (int i = 0; i < node.getChildCount(); i++) {
            if (!result){
                result = depthFirstSearchR((DefaultMutableTreeNode)node.getChildAt(i), n);
            }
        }

        return result;
    }
    public static boolean depthFirstSearch (DefaultMutableTreeNode node, int n){
        LinkedList<DefaultMutableTreeNode> stack= new LinkedList<>();

        stack.push(node);

        while (!stack.isEmpty()){
            DefaultMutableTreeNode temp = stack.pop();

            if ((Integer) temp.getUserObject() == n){
                return true;
            }

            else {
                for (int i = 0; i < temp.getChildCount(); i++) {
                    stack.push((DefaultMutableTreeNode) temp.getChildAt(i));
                }
            }
        }

        return false;
    }





}
