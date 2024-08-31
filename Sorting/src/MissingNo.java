import java.util.Arrays;

public class MissingNo {
    public static void main(String[] args) {
        int[]arr = {0,2,3,4,5};
        int no = MissingNo(arr);
//        System.out.println(Arrays.toString(arr));
        System.out.println(no);
    }
    public static int MissingNo(int[] arr) {
        int i = 0;
        while(i < arr.length){
            int correctIndex = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correctIndex]){
                swap(arr, i , correctIndex);
            }else{
                i++;
            }
        }

        for (int index = 0; index < arr.length; index++) {
            if(arr[index] != index){
                return index;
            }
        }
        return arr.length;
    }

    static void swap(int[]arr ,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
