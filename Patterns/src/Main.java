public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        pattern28(4);
    }

    static void pattern1(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    static void pattern2(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern3(int n) {
        for (int row = 0; row <= n; row++) {
            for (int col = 0; col <= n - row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern4(int n) {
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    static void pattern5(int n) {
        for (int row = 0; row <= 2*n; row++) {
            int totoalcol = row > n ? 2*n-row-1: row;
            for (int col = 0; col <= totoalcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern28(int n) {
        for (int row = 0; row <= 2*n; row++) {
            int totoalcol = row > n ? 2*n-row-1: row;

            for (int space = 0; space < n-totoalcol; space++) {
                System.out.print(" ");
            }
            for (int col = 0; col <= totoalcol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    static void pattern5x(int n) {
        for (int row = 0; row <= 2*n; row++) {
            if (row <= n ) {
                for (int col = 0; col <= row; col++) {
                    System.out.print("* ");
                }
            }else{
            for (int col = 0; col <= 2*n-row; col++){
                System.out.print("* ");
            }
            }
            System.out.println();

        }
    }
    

}