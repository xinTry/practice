package dataStructure;

public class BinaryTree {

    public static void preNode1(BinaryTreeNode node){
        System.out.println(node.getData());
        BinaryTreeNode left = node.getLeft();
        if(left !=null){
           // System.out.println(left.getData());
            preNode1(left);
        }
        preNode1(left.getRight());
    }

    public static void preNode(BinaryTreeNode node){
        if(node != null){
            System.out.println(node.getData());
            preNode(node.getLeft());
            preNode(node.getRight());
        }
    }

    public static void createTree(){
        BinaryTreeNode binaryTreeNode10 = new BinaryTreeNode(10,null,null);
        BinaryTreeNode binaryTreeNode9 = new BinaryTreeNode(9,null,binaryTreeNode10);
        BinaryTreeNode binaryTreeNode8 = new BinaryTreeNode(8,null,null);
        BinaryTreeNode binaryTreeNode7 = new BinaryTreeNode(7,null,null);
        BinaryTreeNode binaryTreeNode6 = new BinaryTreeNode(6,null,null);
        BinaryTreeNode binaryTreeNode5 = new BinaryTreeNode(5,binaryTreeNode8,binaryTreeNode9);
        BinaryTreeNode binaryTreeNode4 = new BinaryTreeNode(4,null,null);
        BinaryTreeNode binaryTreeNode3 = new BinaryTreeNode(3,binaryTreeNode6,binaryTreeNode7);
        BinaryTreeNode binaryTreeNode2 = new BinaryTreeNode(2,binaryTreeNode4,binaryTreeNode5);
        BinaryTreeNode binaryTreeNode1 = new BinaryTreeNode(1,binaryTreeNode2,binaryTreeNode3);


    }
}
