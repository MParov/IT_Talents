import java.util.Arrays;

public class Task_12 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};

        int transfer = array[0];

        array[0] = array[1];
        array[1] = transfer;

        array[2] += 1;
        array[3] += (-1);

        array[4] *= ((12) * 0.1);
        array[5] *= ((9) * 0.1);

/*        int transfer = array[0];
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                array[0] = array[1];
                array[1] = transfer;
            } else if (i == 2) {
                array[2] += 1;
                array[3] += (-1);
            } else if (i == 4) {
                array[4] *= ((12) * 0.1);
                array[5] *= ((9) * 0.1);
            }
        }*/

        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1) {
                System.out.print(array[i] + ", ");
            } else {
                System.out.print(array[i] + ".");
            }
        }
    }
}
