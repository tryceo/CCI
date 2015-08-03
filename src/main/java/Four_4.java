import sun.awt.image.ImageWatched;

import javax.swing.tree.DefaultMutableTreeNode;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by jackli on 6/25/2015.
 */
public class Four_4 {

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
        DefaultMutableTreeNode node3 = (DefaultMutableTreeNode) node2.getChildAt(0);
        node3.insert(new DefaultMutableTreeNode(10832), 0);
        generateListsR(node);
    }

    public static List<LinkedList<DefaultMutableTreeNode>> generateLists (DefaultMutableTreeNode node){
        List<LinkedList<DefaultMutableTreeNode>> listOfLists = new ArrayList<>();

        LinkedList<DefaultMutableTreeNode> current = new LinkedList<>();
        current.add(node);

        while (!current.isEmpty()){
            LinkedList<DefaultMutableTreeNode> parents = current;
            listOfLists.add(parents);
            current = new LinkedList<>();

            for(DefaultMutableTreeNode parent : parents){
                for (int i = 0; i < parent.getChildCount(); i++) {
                    current.add((DefaultMutableTreeNode)parent.getChildAt(i));

                }
            }
        }
        return listOfLists;
    }

    public static void generateListsR (DefaultMutableTreeNode node){
        List<LinkedList<DefaultMutableTreeNode>> listOfLists = new ArrayList<>();
        generateListsR(node, listOfLists, 0);
        System.out.println(listOfLists);

    }
    public static void generateListsR (DefaultMutableTreeNode node, List<LinkedList<DefaultMutableTreeNode>> listOfLists, int level ){
        LinkedList<DefaultMutableTreeNode> current;
        if (listOfLists.size() <= level){
            current = new LinkedList<>();
            listOfLists.add(current);
        }else {
            current = listOfLists.get(level);
        }

        current.add(node);

        for (int i = 0; i < node.getChildCount(); i++) {
            generateListsR((DefaultMutableTreeNode) node.getChildAt(i), listOfLists, level + 1);
        }
    }
}
