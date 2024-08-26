public class SearchInRange {
    public static void main(String[] args) {
        int[] arr = {1,9,-9,99,55,69,77};

        int start = 3;
        int end = 5;
        int target = 69;

        int value = Search(arr, target, start, end);

        System.out.println(value);

    }

    static int Search(int[]arr, int target, int start, int end){

        if (arr.length == 0){
            return -1;
        }

        for (int i = start; i <= end; i++) {
            if(target == arr[i]){
                 return i;
            };

        }

        return -1;
    }
}
