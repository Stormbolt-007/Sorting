package insertionSort;

import java.util.Arrays;

public class Insertion_Sorting {
    public static void main(String[] args) {
        int[] arr = {12,8,16,5,2};
        System.out.println("unsorted -->" + Arrays.toString(arr));
        Insertion_Sorting obj = new Insertion_Sorting();
        obj.insertionSort(arr);
        System.out.println("sorted -->" + Arrays.toString(arr));
    }

    public void insertionSort(int[] arr){
        //step-1
        int sortedIndex = 0;
        //step-2
        for (int unsortedIndex = 1; unsortedIndex < arr.length; unsortedIndex++) {
            //step-3
            int nextElement = arr[unsortedIndex];
            System.out.println("nextElement = " + nextElement);
            //step-4
            for (int j = unsortedIndex; j > 0; j--) {
                //step-4.1
                if(arr[j] < arr[j-1]){
                    //swap
                    System.out.println("swapping --> "+ arr[j]+ " with --> " + arr[j-1]);
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
                else{
                    break;
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(Arrays.toString(arr));
        }
    }
}
