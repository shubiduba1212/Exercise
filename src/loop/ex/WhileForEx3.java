package loop.ex;

public class WhileForEx3 {
    public static void main(String[] args) {
        int sum = 0;
//        int i = 1;
//
//        while (i <= 10){
//            sum = sum + i;
//            System.out.println("max = "+i+" sum = "+sum);
//            i++;
//        }

        for (int i = 1; i <= 100; i++){
            sum = sum + i;
            System.out.println("max = "+i+" sum = "+sum);
        }
    }
}
