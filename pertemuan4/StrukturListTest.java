package pertemuan4;

public class StrukturListTest {
    public static void main(String[] args) {
        // 1. Create list dengan keyword new
        StrukturList list = new StrukturList();

        list.addMid(3, 1);
        list.addMid(4, 2);
        list.addMid(7, 2);
        list.addMid(8, 2);
        list.addMid(5, 1);
        printList(list.HEAD);
    }

    // Fungsi untuk menampilkan elemen list
    public static void printList(Node head) {
        Node current = head;

        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
    }
}
