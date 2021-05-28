package selectionSort;

import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[] arr = {12,8,16,5,2};
        Selection_Sort obj = new Selection_Sort();
        System.out.println("unsorted --> "+ Arrays.toString(arr));
        obj.selectionSort(arr);
        System.out.println("sorted --> "+ Arrays.toString(arr));
    }

    public void selectionSort(int[] arr){
        //step-1
        int sortedIndex = arr.length;
        int maxElement;
        int maxElementIndex;

        //step-2
        for(int i=0; i < arr.length; i++){
            //step-3 find maximum
            maxElement = arr[0];
            maxElementIndex = 0;
            for(int j=0; j < sortedIndex; j++){
                if(maxElement < arr[j]){
                    maxElement = arr[j];
                    maxElementIndex = j;
                }
            }
            //step-4 swap
            int temp = arr[maxElementIndex];
            --sortedIndex;
            arr[maxElementIndex] = arr[sortedIndex];
            arr[sortedIndex] = temp;
        }
    }
}
