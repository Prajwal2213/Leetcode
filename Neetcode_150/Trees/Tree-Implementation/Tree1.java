class Node{
    int val;
    Node left;
    Node right;

    Node(int val){
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Tree1 {

    public static void preOrder(Node root){
        if(root == null){
            return ;
        }
        System.out.print(root.val);
        preOrder(root.left);
        preOrder(root.right);
        System.out.println();
    }

    public static void Inorder(Node root){
        if(root == null){
            return;
        }

        Inorder(root.left);
        System.out.print(root.val);
        Inorder(root.right);
        System.out.println();
    }

    public static void PostOrder(Node root){
        if(root == null){
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.val);
        System.out.println();
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(5);
        preOrder(root);
        Inorder(root);
        PostOrder(root);
    }
}
