package bubbleSort;

import java.util.Arrays;

public class Bubble_Sorting {
    public static void main(String[] args) {
        int[] arr = {12,8,16,5,2};
        Bubble_Sorting obj = new Bubble_Sorting();
        obj.bubbleSort(arr);
        System.out.println("sorted array");
        System.out.println(Arrays.toString(arr));
    }
    public void bubbleSort(int[] arr){
        //step-1
        for(int i=0; i<arr.length-1; i++){
            //step-2
            for(int j=0;j<arr.length-1-i;j++){
                //step-3
                if(arr[j] > arr[j+1]){
                    System.out.println("swapping ---> "+arr[j]+" with ---> "+arr[j+1]);
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                else{
                    System.out.println("no swapping");
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("after "+ (i+1) +" pass");
            System.out.println(Arrays.toString(arr));
        }
    }
}
