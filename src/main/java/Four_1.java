import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

/**
 * Created by jackli on 6/16/2015.
 */
public class Four_1 {

    public static void main(String[] args) {

        MutableTreeNode node = new DefaultMutableTreeNode(1);
        node.insert(new DefaultMutableTreeNode(2), 0);
        node.insert(new DefaultMutableTreeNode(5), 1);
        MutableTreeNode node1 = (MutableTreeNode) node.getChildAt(0);
        node1.insert(new DefaultMutableTreeNode(3), 0);
        node1.insert(new DefaultMutableTreeNode(4), 1);

        MutableTreeNode node2 = (MutableTreeNode) node1.getChildAt(0);
        node2.insert(new DefaultMutableTreeNode(6), 0);

        System.out.println(getHeight(node));

    }


    public static int getHeight(TreeNode node){
        if (node.isLeaf()){
            return 1;
        }

        int heightl = 0;
        int heightr = 0;
        if (node.getChildCount() > 0){
            heightl = getHeight(node.getChildAt(0));
            if (heightl == -1){
                return -1;
            }
        }

        if (node.getChildCount() > 1){
            heightr = getHeight(node.getChildAt(1));
            if (heightr == -1){
                return -1;
            }
        }

        if (Math.abs(heightl - heightr) > 1){
            return -1;
        }

        else {
            return Math.max(heightl+1, heightr+1);
        }
    }

}
