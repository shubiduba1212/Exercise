package loop.ex;

public class NestedEx2 {
    public static void main(String[] args) {
        int rows = 3;

        for (int i = 0; i <= rows; i++) {
//            for (int j = rows - i; j <= rows; j++) {
//                System.out.print('*');
//            }
            for (int j = 1; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }

//        for (int j = rows - i; j >= 0; j--) {
//            System.out.print('*');
//        }

//        for (int k = 1; k <= (rows - 2); k++ ) {
//            System.out.print('*');
//        }
//        for (int j = 1; j <= (rows - 1); j++) {
//            System.out.print('*');
//        }

    }
}
