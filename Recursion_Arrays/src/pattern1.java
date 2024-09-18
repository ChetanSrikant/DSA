public class pattern1 {

    public static void main(String[] args) {
        int row = 4;
        pattern(row, 0);
    }

    static void pattern(int row, int col) {
        // Base case for rows: if no rows left, stop
        if (row == 0) {
            return;
        }

        // If columns in the current row are less than the number of current row, print *
        if (col < row) {
            System.out.print("*");
            pattern(row, col + 1);  // Recursive call to print the next star in the current row
        } else {
            // When one row is done, move to the next line and reduce the number of rows
            System.out.println();
            pattern(row - 1, 0);  // Move to the next row with column reset to 0
        }
    }
}
