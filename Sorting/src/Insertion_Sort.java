import java.util.Arrays;

public class Insertion_Sort {
    public static void main(String[] args) {
        int[]arr = {9,-3,2,5,10};
        insertion_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void insertion_Sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j > 0; j--) {
                if (arr[j]<arr[j-1]){
                    swap(arr, i,j);
                }else{
                    break;
                }
            }
        }
    }


    static void swap(int[]arr ,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

}
