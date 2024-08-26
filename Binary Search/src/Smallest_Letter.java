public class Smallest_Letter {
    public static void main(String[] args) {

    }

    static int binarySearch(char[]letters, char target){
        if (target > letters[letters.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = letters.length - 1;


        while (start <= end){

            int mid = start + (end - start)/2;
            if(target < letters[mid]){
                end = mid-1;
            } else {
                start = mid+1;
            }
        }
        return letters[start% letters.length];
    }
}
