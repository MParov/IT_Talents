public class Task_03 {
    public static void main(String[] args) {
        int[][] array = {
                {1, 4, 6, 3},
                {5, 9, 7, 2},
                {4, 8, 1, 9},
                {2, 3, 4, 5}
        };

        int sum = 0;
        double numberOfElements = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                sum += array[row][col];
                numberOfElements++;
            }
        }
        System.out.println("The sum of elements in the multiple array is: " + sum + ". The average is : " + (sum / numberOfElements));
    }
}
