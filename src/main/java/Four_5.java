/**
 * Created by jackli on 7/8/2015.
 */
public class Four_5 {

    public static void main(String[] args) {

        Tree tree = new Tree(20);
        tree.left = new Tree(10);
        tree.right = new Tree(30);
        tree.left.right = new Tree(25);
//        tree.left.left = new Tree(4);
//        tree.left.right = new Tree(5);
//        tree.right.left = new Tree(6);
//        tree.right.right = new Tree(7);

//        Tree tree = new Tree(1);
//        tree.right =  new Tree(2);
//        tree.right.right = new Tree(3);
//        tree.right.right.right = new Tree(4);
//        tree.right.left = new Tree(123);

        System.out.println(checkBinaryTree(tree));

    }

    public static boolean checkBinaryTree(Tree tree){
        if (tree.left == null && tree.right == null){
            return true;
        }

        boolean resultl = true;
        boolean resultr = true;

        if (tree.left!= null) {
            resultl = false;
            if (tree.left.value <= tree.value) {
                resultl = checkBinaryTree(tree.left);
            }
        }

        if (tree.right!= null) {
            resultr = false;
            if (tree.right.value > tree.value) {
                resultr = checkBinaryTree(tree.right);
            }
        }

        return resultl&&resultr;
    }

}
