public class Task_01 {
    public static void main(String[] args) {
        int[] array = {1, 5, 7, -1, 5, 15, 25};
        boolean allPositive = true;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                allPositive = false;
                break;
            }
        }
        System.out.println(allPositive? "All positive!": "NOT all positive!");
    }
}
