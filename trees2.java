class Node{
    int data;
    Node left ;
    Node right;
    Node (int data){
        this.data = data;
       
    }
}
public class trees2 {
     static void inorder(Node root) {
        if (root == null)
            return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }
     static void preorder(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    static void postorder(Node root) {
        if (root == null)
            return;
        
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
}
    public static void main(String[] args) {
        Node root = new Node(2);
        root.left = new Node(5);
        root.right = new Node(6);
        root.left.left = new Node(8);
        root.left.right = new Node(9);
        root.right.left = new Node(10);
        root.right.right = new Node(11);
        root.left.right.left = new Node(30);
        root.left.right.right = new Node(40);
        root.right.right.left = new Node(65);
        root.right.right.right = new Node(70);
        System.out.print("Inorder  : ");
        inorder(root);
        System.out.println();
        System.out.print("PreOrder : ");
        preorder(root);
        System.out.println();
        System.out.print("PostOrder : ");
        postorder(root);
    }
}   