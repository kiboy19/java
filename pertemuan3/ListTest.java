package pertemuan3;

public class ListTest {
	public static void main(String[] args) {
		//membuat objek array
		StrukturList list = new StrukturList();
		
		//Menambahkan list
		list.addTail(3);
		list.addTail(4);
		list.addTail(5);
		
		//Menampilkan setiap elemen yang terdapat di
		list.displayElement();
	}
}
