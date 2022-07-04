public class Task_06 {
    public static void main(String[] args) {
        int[][] array = {
                {11, 12, 13, 14, 15, 16},
                {21, 22, 23, 24, 25, 26},
                {31, 32, 33, 34, 35, 36},
                {41, 42, 43, 44, 45, 46},
                {51, 52, 53, 54, 55, 56},
                {61, 62, 63, 64, 65, 66}
        };

        int sum = 0;

        for (int row = 0; row < array.length; row++) {
            int rowSum = 0;
            for (int col = 0; col < array[row].length; col++) {
                if (row % 2 != 0) {
                    rowSum += array[row][col];
                    if (col < array[row].length - 1) {
                        System.out.print(array[row][col] + ", ");
                    } else {
                        System.out.println(array[row][col] + " Sum: " + rowSum);
                    }
                }
            }
            sum += rowSum;
        }
        System.out.println("The sum of all elements is: " + sum);
    }
}
