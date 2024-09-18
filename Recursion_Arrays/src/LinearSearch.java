import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[]arr = {1,5,7,69,55,3333,999,55};

        int target = 55;

//        ArrayList<Integer> list = new ArrayList<>();

//        System.out.println(find(arr,target,0));
//
//        System.out.println(findIndex(arr,target,0));
//
//        findAllIndex(arr,target,0);
//        System.out.println(list);

        System.out.println(findAllIndex2(arr,target,0));
    }

    static boolean find(int[]arr, int target, int index){
        if(index == arr.length){
            return false;
        }
        return target==arr[index] || find(arr, target, index+1);
    }

    static int findIndex(int[]arr, int target, int index){
        if(index == arr.length){
            return -1;
        }

        if(arr[index] == target){
            return index;
        }else {
            return findIndex(arr,target, index+1);
        }
    }

    static ArrayList<Integer> list = new ArrayList<>();
    static void findAllIndex(int[] arr,int target, int index){
        if(index == arr.length){
            return;
        }
        if(arr[index] == target){
            list.add(index);
        }

        findAllIndex(arr,target, index+1);

    }

    static ArrayList<Integer> findAllIndex1(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) {
            return list;
        }
        if (arr[index] == target) {
            list.add(index);
        }
        return findAllIndex1(arr, target, index + 1, list);
    }


    static ArrayList<Integer> findAllIndex2(int[] arr,int target, int index){
        ArrayList<Integer> list = new ArrayList<>();

        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
        }

        ArrayList<Integer> fix = findAllIndex2(arr,target, index+1);

        list.addAll(fix);

        return list;

    }
}
