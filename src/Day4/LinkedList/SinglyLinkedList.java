package Day4.LinkedList;

public class SinglyLinkedList {
    public Node head = null;
    public Node tail = null;

    public void addNode(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }

    }
    public void removeFirstNode()
    {
        if (head == null){
            System.out.println("List is empty, nothing to delete.");
            return ;
        }

        Node temp = head;
        head = head.next;
        temp = null;
    }
    public void display(){
        Node temp = head;
        if(temp == null){
            System.out.println("List is empty!!!");
        }
        else{
            while(temp != null){
                System.out.print(temp.data + "->");
                temp = temp.next;
            }
            System.out.println("NULL");
        }
    }
    public static void main(String[] args) {

        SinglyLinkedList list = new SinglyLinkedList();
        list.addNode(4);
        list.addNode(7);
        list.addNode(9);
        System.out.print("Original list: ");
        list.display();
        list.removeFirstNode();
        System.out.print("After deleting the head node: ");
        list.display();
    }
}