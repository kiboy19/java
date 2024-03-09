package pertemuan1;

public class NodeMain {
	public static void main(String[] args) {
		// Membuat 4 buah node untuk TES 4 bagian a , diantaranya n1, n2, n3, n4
		Node n1 = new Node(5);
		Node n2 = new Node(7);
		Node n3 = new Node(9);
		Node n4 = new Node(8);
		
		
		//Membuat 5 Buah Node untuk TES 4 bagian b, diantaranya b1, b2, b3, b4, b5
		Node b1 = new Node(2);
		Node b2 = new Node(3);
		Node b3 = new Node(5);
		Node b4 = new Node(7);
		Node b5 = new Node(9);

		
		
		// Membuat relasi Node n1, n2, n3, n4
		n1.setNext(n2);
		n2.setNext(n3);
		n3.setNext(n4);
		
		// Membuat relasi Node b1, b2, b3, b4
		b1.setNext(b2);
		b2.setNext(b3);
		b3.setNext(b4);
		b4.setNext(b5);

		
		// Menampilkan Node n1, n2, n3, n4 dengan Pointer p
		Node p = n1;
		while(p !=null) {
			System.out.printf("%d ", p.getNilai());
			p = p.getNext();
		}
		
		//pemberian batas
		System.out.println("");
		
		// Menampilkan Node b1, b2, b3, b4, b5 dengan Pointer m
				Node m = b1;
				while(m !=null) {
					System.out.printf("%d ", m.getNilai());
					m = m.getNext();
				}
	}
}
