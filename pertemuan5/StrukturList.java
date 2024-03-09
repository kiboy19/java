package pertemuan5;

public class StrukturList {
	private Node HEAD;

    public StrukturList() {
        this.HEAD = null;
    }

    // Method untuk menambah elemen di awal list
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = HEAD;
        HEAD = newNode; //
    }

    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            temp.next = null;
            dispose(temp);
        }
    }

    private void dispose(Node node) {
        node = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void displayList() {
        Node current = HEAD;
        while (current != null) {
            System.out.print(current.getData());
            current = current.getNext();
        }
        System.out.println();
    }
    
    public void removeTail() {
    	   Node preNode = null;
    	   Node lastNode = HEAD;

    	   if (HEAD != null) {
    	       if (HEAD.next == null) {
    	           HEAD = null;
    	       } else {
    	           while (lastNode.next != null) {
    	               preNode = lastNode;
    	               lastNode = lastNode.next;
    	           }
    	           preNode.next = null;
    	           dispose(lastNode);
    	       }
    	   }
    	}
}
