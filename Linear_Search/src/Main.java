import javax.sound.sampled.Line;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        int[] nums = {1,9,-20,36,49,45,99,-100};
        int target = 45;

//        int ans = Linear_Search(nums, target);
        int ans = LinearSearch2(nums,target);
        System.out.println(ans);
    }

    static int Linear_Search(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }
        for (int index = 0; index < arr.length; index++) {
            if (target == arr[index]){
                return index;
            }
        }
        return -1;
    }
    
    static int LinearSearch2(int[] arr, int target){
        if (arr.length == 0){
            return -1;
        }

        for (int element:arr) {
            element = target;
            return element;
        }
        return -1;
    }
}