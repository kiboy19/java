package pertemuan9;

public class Main {
    public static void main(String[] args) {
        // Buat objek StrukturStack dengan kapasitas 3
        StrukturStack stack = new StrukturStack(3);

        // Sebelum melakukan push
        System.out.println("#Sebelum push");
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.printElementsFromTop();
        
        // Melakukan operasi push sebanyak 3 kali
        System.out.println("#Melakukan push 3x:");
        stack.push(2);
        stack.push(4);
        stack.push(1);
        System.out.println("push 2, push 4, push 1");
        
        // Setelah melakukan push
        System.out.println("Size: " + stack.size());
        System.out.println("Empty: " + stack.isEmpty());
        System.out.println("Full: " + stack.isFull());
        System.out.println("Top: " + stack.top());
        stack.printElementsFromTop();
    }
}
