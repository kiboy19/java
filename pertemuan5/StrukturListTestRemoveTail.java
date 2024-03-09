package pertemuan5;

public class StrukturListTestRemoveTail {
    public static void main(String[] args) {
        // 1. Create list dengan keyword new
        StrukturList myList = new StrukturList();
        
        // 2. Tambah elemen sehingga elemen list berisi (2, 6, 3, 5, 1)
        myList.addFirst(1);
        myList.addFirst(5);
        myList.addFirst(3);
        myList.addFirst(6);
        myList.addFirst(2);
        
        // 3. Tampilkan elemen list
        System.out.println("Elemen list sebelum penghapusan:");
        myList.displayList();
        
        // 4. Hapus elemen di akhir list
        myList.removeTail();
        
        // 5. Tampilkan elemen list
        System.out.println("Elemen list setelah penghapusan di akhir:");
        myList.displayList();
        
        // 6. Hapus elemen di awal list
        myList.removeHead();
        
        // 7. Tampilkan elemen list
        System.out.println("Elemen list setelah penghapusan di awal:");
        myList.displayList();
        
    }
}
