public class Task_05 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {2, 5, 9, 8, 7},
                {7, 6, 8, 2, 5}
        };
        int maxSum = Integer.MIN_VALUE;
        int maxRow = 0;
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
            }
            if (row == 0) {
                maxRow = sum;
            } else if (sum > maxSum) {
                maxSum = sum;
                maxRow = row;
            }
        }
        System.out.println(maxRow);
    }
}
