package ListClass;

public class MyList<T> {
    private Object[] arr;
    private Object[] newArr;
    //private int count = 0;

    public MyList() {
        this.arr = new Object[10];
    }

    public MyList(int capacity) {
        this.arr = new Object[capacity];
    }

    public int size() {
        int count = 0;
        for (Object i : this.arr) {
            if (i != null) {
                count++;
            }
        }
        return count;
    }

    public int getCapacity() {
        return this.arr.length;
    }

    public void add(T data) {
        if (size() == getCapacity()) {
            int newCapacity = getCapacity() * 2;
            this.newArr = new Object[newCapacity];

            for (int i = 0; i < getCapacity(); i++) {
                this.newArr[i] = this.arr[i];
            }

            this.arr = this.newArr;
        }

        this.arr[size()] = data;
    }

    public Object get(int index) {
        if (index < 0 || index >= getCapacity()) {
            return null;
        }

        return this.arr[index];
    }

    public void remove(int index) {
        if (index < 0 || index >= getCapacity()) {
            System.out.println("ERROR: Remove operation failed!");
            return;
        }

        this.newArr = new Object[getCapacity()];

        for (int i = 0; i < getCapacity(); i++) {
            if (i >= index && i <= size()) {
                this.newArr[i] = this.arr[++i];
                i--;
            } else {
                this.newArr[i] = this.arr[i];
            }
        }
        this.arr = this.newArr;
    }

    public void set(int index, T data) {
        if (index < 0 || index >= getCapacity()) {
            System.out.println("ERROR: Wrong index value!");
            return;
        }
        this.arr[index] = data;
    }

    public String toString() {
        if (this.size() > 0) {
            System.out.print("[");
            for (int i = 0; i <= size(); i++) {
                if (++i == size()) {
                    System.out.print(this.arr[--i].toString());
                    System.out.print("]");
                    return "";
                } else {
                    System.out.print(this.arr[--i].toString() + ", ");
                }
            }
        }

        return "[]";
    }

    public int indexOf(T data) {
        for (int i = 0; i < size(); i++) {
            if (this.arr[i].toString().equals(data.toString())) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        for (int i = size() - 1; i >= 0; i--) {
            if (this.arr[i].toString().equals(data.toString())) {
                return i;
            }
        }
        return -1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public Object[] toArray() {
        return this.arr;
    }

    public void clear() {
        for (int i = 0; i < getCapacity(); i++) {
            set(i, null);
        }
    }

    public MyList<T> sublist(int start, int finish) {
        if (start < 0 || finish > size() || (start > finish)) {
            System.out.println("ERROR: Out of bound!");
            return null;
        }

        int count = 0;
        this.newArr = new Object[getCapacity()];

        for (int i = start; i <= finish; i++) {
            this.newArr[count++] = this.arr[i];
        }

        this.arr = this.newArr;

        return this;
    }

    public boolean contains(T data) {
        for (Object val : this.arr) {
            if (val == data) {
                return true;
            }
        }
        return false;
    }
}
