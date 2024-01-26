package loop.ex;

public class WhileForEx2 {
    public static void main(String[] args) {
        int num = 0;
//        int i = 1;

//        while (num < 10) {
//            if((i % 2) == 0){
//              num++;
//              System.out.println(i);
//            }
//            i++;
//        }

        for (int i = 1; num < 10; i++){
            if((i % 2) == 0){
              num++;
              System.out.println(i);
            }
        }
    }
}
