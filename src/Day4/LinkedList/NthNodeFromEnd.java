package Day4.LinkedList;

public class NthNodeFromEnd {
    Node head;

    class Node {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }

    int findNthFromLast(int N)
    {
        int len = 0;
        Node temp = head;

        while (temp != null) {
            temp = temp.next;
            len++;
        }
        if (len < N)
            return -1;

        temp = head;
        for (int i = 1; i < len - N + 1; i++)
            temp = temp.next;

        return temp.data;
    }


    public void push(int new_data)
    {

        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }


    public static void main(String[] args)
    {
        NthNodeFromEnd llist = new NthNodeFromEnd();
        llist.push(20);
        llist.push(4);
        llist.push(15);
        llist.push(35);

        System.out.println(llist.findNthFromLast(4));
    }
}