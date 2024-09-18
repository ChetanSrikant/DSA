public class Main {
    public static void main(String[] args) {
//        find if the arrey is sorted or not using recursion
        int[]arr = {1,2,3,4,5,0};

        boolean ans = sorted(arr,0);

        System.out.println(ans);
    }

    static boolean sorted(int[]arr, int i){
        if(i == arr.length-1){
            return true;
        }

        return arr[i]<arr[i+1]&&sorted(arr,i+1);
    }
}