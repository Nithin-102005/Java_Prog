import java.util.LinkedList;
class Node{

    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class Main{
static boolean search(int key){

    Node temp=head;

    while(temp!=null){

        if(temp.data==key)

            return true;

        temp=temp.next;
    }

    return false;
}

    static Node head;

    public static void main(String[] args){

        head=new Node(10);

        head.next=new Node(20);

        head.next.next=new Node(30);

        printList();
    }
    static void printList(){

        Node temp=head;

        while(temp!=null){

            System.out.print(temp.data+" ");

            temp=temp.next;
        }
    }
}
