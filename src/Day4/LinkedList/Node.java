package Day4.LinkedList;
class Node<T> {
    T data;
    Node<T> next;

    public Node() {
    }

    Node(T data) {
        this.data = data;
        this.next = null;
    }
}