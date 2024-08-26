public class FindMin {
    public static void main(String[] args) {
        int[] arr = {1,4,-7,99,8,-1,69,100};

        int ans = min(arr);

        System.out.println(ans);
    }

    static int min(int arr[]) {

        if(arr.length == 0){
            return -1;
        }

        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(arr[i]< min){
                min = arr[i];
            }
        }

        return min;
    }

}
