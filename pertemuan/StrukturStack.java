package pertemuan9;

public class StrukturStack {
    private int[] array;
    private int capacity;
    private int top;
    
    public final int MIN = -1;
    
    public StrukturStack(int capacity) {
        array = new int[capacity];
        this.capacity = capacity;
        top = MIN;
    }
    
    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack penuh");
        } else {
            top++;
            array[top] = data;
        }
    }
    
    public boolean isEmpty() {
        return top == MIN;
    }
    
    public boolean isFull() {
        return top == capacity - 1;
    }
    
    public int top() {
        if (isEmpty()) {
            System.out.println("Stack kosong");
            return -1;
        } else {
            return array[top];
        }
    }
    
    public int size() {
        return top + 1;
    }
    
    public void printElementsFromTop() {
        if (isEmpty()) {
            System.out.println("Elemen dari TOP: Stack kosong");
        } else {
            System.out.print("Elemen dari TOP: ");
            for (int i = top; i >= 0; i--) {
                System.out.print(array[i] + " ");
            }
            System.out.println();
        }
    }
}
