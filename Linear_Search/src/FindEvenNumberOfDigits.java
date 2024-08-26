public class FindEvenNumberOfDigits {
    public static void main(String[] args) {
        int [] nums = {12,345,2,6,7896};

        int ans = findDigits(nums);

        System.out.println(ans);
    }

    static int findDigits(int[] nums) {
        int count = 0;
        for(int num: nums){
            if(even(num)){
                count++;
            }
        }
        return count;
    }

    static boolean even(int num){
        int count = Digits(num);

        if(count%2 == 0){
            return true;
        }
        return false;
    }
    
    static int Digits(int num){
        int count = 0;
        while(num > 0){
            num = num/10;

            count++;
        }
        return count;
    }
}
