package pertemuan4;

public class StrukturList {
    Node HEAD;

    public void addMid(int data, int position) {
        Node newNode = new Node(data);

        if (HEAD == null) {
            HEAD = newNode;
        } else {
            Node curNode = HEAD;

            if (position == 1) {
                newNode.next = curNode;
                HEAD = newNode;
            } else {
                int i = 1;
                Node posNode = null;

                while (curNode != null && i < position) {
                    posNode = curNode;
                    curNode = curNode.next;
                    i++;
                }

                if (posNode == null) {
                    // Position is out of bounds
                    return;
                }

                posNode.next = newNode;
                newNode.next = curNode;
            }
        }
    }
}
