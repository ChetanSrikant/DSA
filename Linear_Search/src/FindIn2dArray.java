import java.lang.reflect.Array;
import java.util.Arrays;

public class FindIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int target = 9;

        int[] ans = search(arr, target);

        System.out.println("The index of the given number is: " + Arrays.toString(ans));

    }

    static int[] search(int[][]arr, int target){
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (target == arr[row][col]){
                    return new int[]{row, col};
                }
            }
        }
        return null;
    }
}
