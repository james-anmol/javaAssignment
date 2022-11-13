package sort;

public abstract class sort {

    int arr[];

    public int[] getArr() {
        return arr;
    }

    public void setArr(int[] arr) {
        this.arr = arr;
    }

    abstract void printArray();
    abstract void sort();
}
