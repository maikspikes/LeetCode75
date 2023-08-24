package algorithms.sorting.quicksort;

public class QuicksortTest {
    // quick sort = moves smaller elements to left of a pivot.
    //			   recursively divide array in 2 partitions
    public static void main(String[] args) {
        int[] array = {8, 2, 4 ,7, 1, 3, 9, 6, 5};

        quickSort(array, 0, array.length -1);

        for (int i: array) {
            System.out.print(i + " ");
        }

    }

    private static void quickSort(int[] array, int start, int end) {

        if (end <= start) {
            return;
        }
        // the partition method will define the pivot
        int pivot = partition(array, start, end);
        // recursively sorting the elements that are smaller than the pivot and are on the left side of it
        quickSort(array, start, pivot - 1);
        // recursively sorting the elements that are greater than the pivot and are on the right side of it.
        quickSort(array, pivot + 1, end);

    }
    private static int partition(int[] array, int start, int end) {
        // you start the pivot in the last number
        int pivot = array[end];
        int i = start - 1;

        for(int j = start; j <= end; j++) {
            if(array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }
        // this is the end of the j loop, so it exchanges its value with the value of the pivot, and "i" will increase!
        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i;
    }
}
