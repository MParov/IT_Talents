public class Task_06 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {2, 5, 9, 8, 7},
                {7, 6, 8, 2, 5},
                {2, 5, 9, 8, 7},
                {7, 6, 8, 2, 5}
        };

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i][i]);

        }
    }
}
