package quickSort;

import java.util.Arrays;

public class Quick_Sorting {
    public static void main(String[] args) {
        int[] arr = {12,8,16,5,2};
        System.out.println("unsorted -->" + Arrays.toString(arr));
        Quick_Sorting obj = new Quick_Sorting();
        obj.quickSorting(arr, 0, arr.length-1);
        System.out.println("sorted -->" + Arrays.toString(arr));

    }

    public void quickSorting(int[] arr, int lower, int upper){
        //step-1
        if(lower >= upper){
            return;
        }
        //step-2
        int pivotIndex = partition(arr, lower, upper);

        //step-3
        quickSorting(arr, lower, pivotIndex-1);

        //step-4
        quickSorting(arr, pivotIndex+1, upper);
    }

    private int partition(int[] arr, int lower, int upper) {
        //step-1
        int pivot = arr[lower];
        int down = lower;
        int up = upper;

        //step-4
        while(down< up){
            //step-4.1
            while(arr[down] <= pivot){
                down += 1;
            }
            //step-4.2
            while (arr[up] > pivot){
                up -= 1;
            }
            //step-4.3
            if (down < up){
                //swap
                int temp = arr[down];
                arr[down] = arr[up];
                arr[up] = temp;
            }
        }
        //step-5
        arr[lower] = arr[up];
        arr[up] = pivot;

        //step-6
        return up;
    }
}
