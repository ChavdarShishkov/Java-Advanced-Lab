package Lab_07_Workshop;

public class SmartArray {
    private int[] elements;
    private int size;

    public SmartArray() {
        this.elements = new int[8];
        this.size = 0;
    }

    public void add(int element) {
        if (this.elements.length == this.size) {

            int[] newElements = new int[this.size * 2];

            System.arraycopy(this.elements, 0, newElements, 0, this.elements.length);
            this.elements = newElements;
        }
        this.elements[this.size++] = element;
    }

    public int remove(int index) {
        int element = get(index);

        for (int i = index; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }

        this.elements[--this.size] = 0;

        if (this.elements.length == this.size *2){

        }

        return element;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public int get(int index) {
        validateIndex(index);
        return this.elements[index];
    }

    public int size() {
        return this.size;
    }

    private void validateIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + "out of bounds for size " + size);
        }
    }

}
