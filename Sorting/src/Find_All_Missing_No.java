import java.util.ArrayList;
import java.util.List;

class Find_All_Missing_No {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5}; // Adjusted example array to match the problem description
        List<Integer> no = findDisappearedNumbers(arr);
        System.out.println(no);
    }

    public static List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correctIndex = arr[i] - 1;
            // Ensure correctIndex is within bounds and not already in the correct position
            if (arr[i] > 0 && arr[i] <= arr.length && arr[i] != arr[correctIndex]) {
                swap(arr, i, correctIndex);
            } else {
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();

        // Collect all the missing numbers
        for (int index = 0; index < arr.length; index++) {
            if (arr[index] != index + 1) {
                ans.add(index + 1);
            }
        }

        return ans;
    }

    static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
