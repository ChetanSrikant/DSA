import java.util.Arrays;
import java.util.Scanner;

public class arrays2d {
    public static void main(String[] args) {
        int[]arr = new int[5];

        int[][] arr2d = {
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        int [][] arrd2 = new int[3][2];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < arrd2.length; i++) {
            for (int j = 0; j < arrd2[i].length; j++) {
                arrd2[i][j] = in.nextInt();
            }
        }


//        for (int i = 0; i < arrd2.length; i++) {
//            for (int j = 0; j < arrd2[i].length; j++) {
//                System.out.print(arrd2[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int i = 0; i < arrd2.length; i++) {
            System.out.println(Arrays.toString(arrd2[i]));
        }

        for (int[] a:arr2d) {
            System.out.println(Arrays.toString(a));
        }
    }
}
