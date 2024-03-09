package pertemuan4;

public class Node {
    private int data;
    public Node next;

    // Konstruktor dengan parameter data
    public Node(int data) {
        this.data = data;
        this.next = null; // Atur next ke null secara default
    }

    // Setter & Getter untuk data
    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    // Getter untuk next
    public Node getNext() {
        return next;
    }
}
