import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;

/**
 * Created by jackli on 6/25/2015.
 */
public class Four_3 {


    public static void main(String[] args) {
        int[] ints = {1,2,3,4,5,6,7,8,9};
        Tree node = generateBinaryTree(ints, 0, 8);
        printTree(node);

    }


    public static void printTree(Tree node){

        if (node != null) {
            System.out.println(node.value);

            printTree(node.left);
            printTree(node.right);
        }
    }
    public static Tree generateBinaryTree(int[] array, int starti, int stopi){

        if (stopi < starti){
            return null;
        }

        int midi = (starti + stopi)/2;
        Tree node = new Tree(array[midi]);
        node.value = array[midi];

        node.left = generateBinaryTree(array, starti, midi -1);
        node.right = generateBinaryTree(array, midi +1, stopi);

        return node;

    }
}
