package pertemuan5;

public class StrukturListTest {
    public static void main(String[] args) {
        // 1. Create list dengan keyword new
        StrukturList list = new StrukturList();

        // 2. Tambah elemen 2 di awal list
        list.addFirst(2);

        // 3. Tambah elemen 9 di awal list
        list.addFirst(9);

        // 4. Tambah elemen 7 di awal list
        list.addFirst(7);

        // 5. Tampilkan elemen list
        list.displayList();

        // 6. Hapus elemen list di awal list
        list.removeHead();

        // 7. Tampilkan elemen list
        list.displayList();
    }
}
