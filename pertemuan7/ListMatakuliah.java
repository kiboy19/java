package pertemuan7;

public class ListMatakuliah {
    private Matakuliah HEAD;

    public ListMatakuliah() {
        HEAD = null; // Initialize HEAD to null indicating an empty list
    }

    public boolean isEmpty() {
        return HEAD == null; // Check if HEAD is null, indicating an empty list
    }

    public void addHead(Matakuliah data) {
        Matakuliah newNode = new Matakuliah(data.getKode(), data.getNama(), data.getSks());

        if (isEmpty()) {
            HEAD = newNode;
        } else {
            newNode.setNext(HEAD);
            HEAD = newNode;
        }
    }

    public void displayElement() {
        Matakuliah curNode = HEAD;
        while (curNode != null) {
            System.out.println("Matakuliah: " + curNode.getKode() + ", Nama: " + curNode.getNama() + ", SKS: " + curNode.getSks());
            curNode = curNode.getNext();
        }
        System.out.println();
    }
    
    public boolean find(String x) {
        Matakuliah curNode = HEAD;
        boolean ketemu = false;

        while (curNode != null && !ketemu) {
            if (curNode.getKode().equals(x)) {
                ketemu = true;
            }
            curNode = curNode.getNext();
        }

        return ketemu;
    }
    
    public int size() {
        Matakuliah curNode = HEAD;
        int jumlah = 0;

        while (curNode != null) {
            jumlah++;
            curNode = curNode.getNext();
        }

        return jumlah;
    }
}
