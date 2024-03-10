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
    
    public void removeMid(int e) {
        Node preNode = new Node(0);
        Node tempNode = HEAD; // Initialize tempNode with HEAD
        int i = 1;
        boolean ketemu = false;

        if (isEmpty()) {
            System.out.println("List is empty");
        } else {
            while (tempNode.getNext() != null && !ketemu) {
                if (tempNode.getData() == e) {
                    ketemu = true;
                } else {
                    preNode = tempNode;
                    tempNode = tempNode.getNext();
                    i++;
                }
            }

            if (ketemu) {
                if (i == 1) {
                    HEAD = null;
                } else {
                    preNode.setNext(tempNode.getNext());
                }
                dispose(tempNode);
            } else {
                System.out.println("Element not found");
            }
        }
    }
    public void display() {
        Node tempNode = HEAD;
        while (tempNode != null) {
            System.out.print(tempNode.getData() + " ");
            tempNode = tempNode.getNext();
        }
        System.out.println();
    }
}
