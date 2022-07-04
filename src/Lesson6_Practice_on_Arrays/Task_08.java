public class Task_08 {
    public static void main(String[] args) {
        boolean[][] arr = {
                {false, false, false, false},
                {false, false, false, false},
                {false, false, true, false},
                {true, false, true, false}
        };
        boolean haveTrue = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-(i+1); j++) {
                if (arr[i][j] == true) {
                    haveTrue = true;
                    break;
                }


            }

        }
        System.out.println(haveTrue? "Have true!": "Not have true!");
    }
}
