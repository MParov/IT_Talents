public class Task_05 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int maxSumRows = Integer.MIN_VALUE;
        int maxSumCols = Integer.MIN_VALUE;

        for (int row = 0; row < array.length; row++) {
            int maxSumRow = 0;
            int maxSumCol = 0;
            for (int col = 0; col < array[row].length; col++) {
                maxSumRow += array[row][col];
                maxSumCol += array[col][row];
            }
            if (maxSumRows < maxSumRow) {
                maxSumRows = maxSumRow;
            }
            if (maxSumCols < maxSumCol) {
                maxSumCols = maxSumCol;
            }
        }
        System.out.println("Largest sum by rows: " + maxSumRows);
        System.out.println("Largest sum by columns: " + maxSumCols);
        if (maxSumRows > maxSumCols) {
            System.out.println("The largest sum by rows is > (bigger) from largest sum by columns.");
        }else if(maxSumRows < maxSumCols){
            System.out.println("The largest sum by rows is < (smaller) from largest sum by columns.");
        }else {
            System.out.println("The largest sum by rows and the largest sum by columns are equals.");
        }
    }
}
