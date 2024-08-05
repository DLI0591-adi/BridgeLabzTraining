package Day4.LinkedList;

import org.w3c.dom.Node;

import java.util.Vector;


public class LLMiddleNode {
    public Node head = null;
    public Node tail = null;

    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

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
    int getMiddle(Node head) {

        Vector<Integer> list_values = new Vector<>();

        while (head != null) {
            list_values.add(head.data);
            head = head.next;
        }
        int mid_index = list_values.size() / 2;
        return list_values.get(mid_index);
    }
    public static void main(String[] args) {
        LLMiddleNode list = new LLMiddleNode();
        list.addNode(4);
        list.addNode(5);
        list.addNode(8);
        list.addNode(9);
        list.addNode(10);

        System.out.print("Original list: ");
        list.display();
        System.out.println("Middle Element of LL: "+ list.getMiddle(list.head));
    }
}