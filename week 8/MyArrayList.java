@SuppressWarnings("unchecked")
public class MyArrayList<T> implements ListOperstion<T>{
    private T[] array;
    private int size;

    public MyArrayList() {
        array = (T[]) new Object[10]; // Initial capacity of 10
        size = 0;
    }

    private void expandCapacity() {
        T[] newArray = (T[]) new Object[array.length * 2];
        for (int i = 0; i < size; i++) {
            newArray[i] = array[i];
        }
        array = newArray;

    }

    @Override
    public void add(T item) {
        if (size == array.length) {
            expandCapacity();
        }
        array[size] = item;
        size++;
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.err.println("Index out of bounds: " + index);
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        array[size - 1] = null; // Clear the last element
        size--;
    }

    @Override
    public void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }
        for (int i = 0; i < size; i++) {
            System.out.println(array[i]);
        }
    }

    public int size() {
        return size;
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            System.err.println("Index out of bounds: " + index);
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);
        }
        return array[index];
    }

    // Metode untuk menyalin elemen dari daftar lain yang tipenya kompatibel
    public void copyFrom(MyArrayList<? extends T> source) {
         for (int i = 0; i < source.size(); i++) {
             add(source.get(i));
        }
    }
        
    // Metode untuk menyalin elemen ke daftar lain yang tipenya kompatibel
    public void copyTo(MyArrayList<? super T> destination) {
        for (int i = 0; i < size; i++) {
            destination.add(get(i));
        }
    }
}