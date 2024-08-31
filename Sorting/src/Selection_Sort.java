import java.util.Arrays;

public class Selection_Sort {
    public static void main(String[] args) {
        int[]arr = {9,-3,2,5,10};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[]arr){
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i -1;
            int max = maximum(arr, 0, last);

            swap(arr, max, last);
        }
    }

    static void swap(int[]arr ,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }


    static int maximum(int[]arr, int start, int end){
        int max = start;

        for (int i = 0; i <= end; i++) {
            if(arr[i]> arr[max]){
                max = i;
            }
        }

        return start;
    }
}
