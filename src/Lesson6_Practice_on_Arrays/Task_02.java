package Lesson6_Practice_on_Array;
public class Task_02 {
    public static void main(String[] args) {
        int[] array = {1, 3, 1, 3, 1};
        boolean isZigZag = true;
        for (int i = 1; i < array.length - 1; i++) {
            boolean biggerThenNeighbours = array[i] > array[i - 1] && array[i] > array[i + 1];
            boolean smallerThenNeighbours = array[i] < array[i - 1] && array[i] < array[i + 1];
            if (!(biggerThenNeighbours||smallerThenNeighbours)) {
                isZigZag = false;
                break;
            }
        }
        System.out.println(isZigZag ? "ZigZag!" : "NOT ZigZag!");
    }
}
