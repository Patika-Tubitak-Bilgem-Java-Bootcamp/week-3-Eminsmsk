import java.util.Arrays;
import java.util.Objects;

public class MyList<T> {

    private T[] arr;
    private final int DEFAULT_CAPACITY = 10;
    private int numOfElements;

    public MyList() {
        this.arr = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList(int initialCapacity) {
        this.arr = (T[]) new Object[initialCapacity];
    }

    public int size() {
        return numOfElements;
    }

    public int getCapacity() {
        return arr.length;
    }

    public void add(T data) {
        if (size() == getCapacity()) {
            this.arr = Arrays.copyOf(this.arr, getCapacity() * 2);
        }
        this.arr[numOfElements++] = data;
    }

    public T get(int index) {
        if (isIndexValid(index)) {
            return this.arr[index];
        } else {
            return null;
        }
    }

    public T remove(int index) {
        T itemToBeDeleted = get(index);
        if (itemToBeDeleted != null) {
            shiftArray(index);
            this.numOfElements--;
            return itemToBeDeleted;
        } else {
            return null;
        }
    }

    public boolean isIndexValid(int index) {
        return index >= 0 && index < getCapacity();
    }

    public void shiftArray(int index) {
        for (int i = index; i < this.numOfElements; i++) {
            this.arr[i] = this.arr[i + 1];
        }
    }

    public T set(int index, T data) {
        T itemToBeReplaced = get(index);
        if (itemToBeReplaced != null) {
            this.arr[index] = data;
            return itemToBeReplaced;
        } else {
            return null;
        }
    }

    public String toString() {
        return Arrays.toString(this.arr);
    }

    public int indexOf(T data) {
        for (int i = 0; i < this.numOfElements; i++) {
            if (this.arr[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = this.numOfElements - 1; i >= 0; i--) {
            if (this.arr[i].equals(data)) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return this.numOfElements == 0;
    }

    public T[] toArray() {
        T[] newArr = (T[]) new Object[numOfElements];
        for (int i = 0; i < numOfElements; i++)
            newArr[i] = this.arr[i];
        return newArr;
    }

    public void clear() {
        this.arr = (T[]) new Object[DEFAULT_CAPACITY];
    }

    public MyList<T> sublist(int start, int finish) {
        if (start < 0 || finish > size() || finish < start)
            return null;

        MyList<T> sublist = new MyList<>(finish - start + 1);
        for (int i = start; i <= finish; i++)
            sublist.add(this.arr[i]);
        return sublist;
    }

    public boolean contains(T data) {
        return indexOf(data) >= 0;
    }


}
