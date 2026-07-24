class Node{
    int data;
    Node left ;
    Node right;
    Node (int data){
        this.data = data;
        left = null;
        right = null;
    }
}
public class trees1 {
    public static void main(String[] args) {
        Node root = new Node(50);
        root.left = new Node(40);
        root .right = new Node(30);
        root.left.left = new Node(20);
        root.left.right = new Node(10);
        root.right.right = new Node(5);
        root.right.left = new Node(1);

        System.out.println(root.data);
    }
    
}
