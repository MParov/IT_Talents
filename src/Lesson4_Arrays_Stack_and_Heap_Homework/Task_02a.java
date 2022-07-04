public class Task_02a {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length / 2; i++) {
            newArray[i] = array[i];
        }
        int arrayHalf = newArray.length / 2;
        for (int i = array.length - 1; i > (newArray.length / 2) - 1; i--) {
            newArray[arrayHalf] = array[i];
            arrayHalf++;
        }
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + ", ");
        }
    }
}
