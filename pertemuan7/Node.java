package pertemuan7;

public class Node {
    private Matakuliah data;
    public Node next;

    // Konstruktor dengan parameter data
    public Node(Matakuliah data) {
        this.data = data;
        this.next = null; // Atur next ke null secara default
    }

    // Setter & Getter untuk data
    public void setData(Matakuliah data) {
        this.data = data;
    }

    public Matakuliah getData() {
        return data;
    }

    // Getter untuk next
    public Node getNext() {
        return next;
    }
    
    public void setNext(Node next) {
        this.next = next;
    }
}
