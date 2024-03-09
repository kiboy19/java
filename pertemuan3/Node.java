package pertemuan3;

public class Node {
	private int data;
	private Node next;
	
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

    // Setter & Getter untuk next
    public void setNext(Node next) {
        this.next = next;
    }

    public Node getNext(){
        return next;
    }
}
