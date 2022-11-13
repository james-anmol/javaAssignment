package sort;

public class quickSort extends sort {



    public void insertionSort(int arr[])
    {
        if (arr.length <= 1)                             //passes are done
        {
            return;
        }

        insertionSort( arr );        //one element sorted, sort the remaining array

        int last = arr[arr.length-1];                        //last element of the array
        int j = arr.length-2;                                //correct index of last element of the array

        while (j >= 0 && arr[j] > last)                 //find the correct index of the last element
        {
            arr[j+1] = arr[j];                          //shift section of sorted elements upwards by one element if correct index isn't found
            j--;
        }
        arr[j+1] = last;                            //set the last element at its correct index
    }



    @Override
    public void printArray() {
        try {
            for (int i = 0; i < 10; ++i) {
                System.out.print(this.arr[i] + " ");
            }
        }

        catch (ArrayIndexOutOfBoundsException q) {
            //System.out.println("");


        }

    }

    @Override
    void sort() {
        insertionSort(this. arr);
    }
}
