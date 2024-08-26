public class MaxValue {
    public static void main(String[] args) {
        int[] arr = {1,3,99,5,66};

        System.out.println(max(arr));
    }

    static int max(int[] arr){

        int maxi = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxi){
                maxi = arr[i];
            }
        }

        return maxi;

    }
}
