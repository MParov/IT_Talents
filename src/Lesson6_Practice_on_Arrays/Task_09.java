public class Task_09 {
    public static void main(String[] args) {
        int[][] arr = {
                {7, 1, 8, 4, 3},
                {2, 6, 3, 8, 1},
                {6, 2, 4, 4, 5},
                {9, 0, 3, 2, 9}
        };
        int maxSum = 0;
        int maxI = 0;
        int maxJ = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr[i].length - 1; j++) {
                int sum = arr[i][j] + arr[i][j + 1] + arr[i + 1][j] + arr[i + 1][j + 1];
                if (i == 0 && j == 0) {
                    maxSum = sum;
                }else if(sum>maxSum){
                    maxSum=sum;
                    maxI=i;
                    maxJ=j;
                }
            }
        }
        System.out.println(arr[maxI][maxJ]+" "+arr[maxI][maxJ+1]);
        System.out.println(arr[maxI+1][maxJ]+" "+arr[maxI+1][maxJ+1]);
    }
}
