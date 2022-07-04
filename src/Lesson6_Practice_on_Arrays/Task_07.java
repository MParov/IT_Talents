public class Task_07 {
    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 4, 5},
                {2, 5, 9, 8, 7},
                {7, 6, 8, 2, 5},
                {2, 5, 9, 8, 7},
                {7, 6, 8, 2, 5}
        };
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++) {

                product *= arr[i][j];

            }

        }
        System.out.println(product);
    }
}
