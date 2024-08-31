public class First_and_Last_Position {
    public static void main(String[] args) {

    }

    public static int[] searchRange(int[] nums, int target) {
        int[]ans = {-1,-1};

        ans[0] = search(nums, target, true);
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        return ans;
    }

    static int search(int[] nums, int target, boolean findStartIndex){
        int ans = -1;
        int start = 0;
        int end = nums.length -1;

        while(end > start){

//            int mid = start + (end - start)/2;

            int mid = start + (end - start)/2;
            if(target < nums[mid]){
                end = mid-1;
            } else if (target > nums[mid]) {
                start = mid +1;
            }else{
                ans = mid;
                if(findStartIndex){
                    end = mid-1;
                }
                else{
                    start = mid +1;
                }
            }
        }
        return ans;
    }
}