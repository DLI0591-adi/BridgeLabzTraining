package Day4.LinkedList;

public class ReverseLinkedList {
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
    void reverse(){
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
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
        ReverseLinkedList list = new ReverseLinkedList();
        list.addNode(4);
        list.addNode(5);
        list.addNode(6);
        list.addNode(7);

        System.out.print("Original list: ");
        list.display();
        System.out.print("After reverse the linked list: ");
        list.reverse();
        list.display();
    }
}

