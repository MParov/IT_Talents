import java.util.Arrays;

public class Task_04 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1, 0, 0, 0, 0};
        int zeroes = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                zeroes++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i < zeroes ? 0 : 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
