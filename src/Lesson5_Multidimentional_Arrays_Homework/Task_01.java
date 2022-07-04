public class Task_01 {
    public static void main(String[] args) {
        int[][] array = {
                {48, 72, 13, 14, 15},
                {21, 22, 53, 24, 75},
                {31, 57, 33, 34, 35},
                {41, 95, 43, 44, 45},
                {59, 52, 53, 54, 55},
                {61, 69, 63, 64, 65}
        };

        int minElement = Integer.MAX_VALUE;
        int maxElement = Integer.MIN_VALUE;

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] < minElement) {
                    minElement = array[row][col];
                }
                if (array[row][col] > maxElement) {
                    maxElement = array[row][col];
                }
            }
        }
        System.out.println("Min element is: " + minElement);
        System.out.println("Max element is: " + maxElement);
    }
}
