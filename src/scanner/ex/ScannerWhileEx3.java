package scanner.ex;
import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int num2 = 0;
        int num1 = 1;

        while (true) {
            System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요:");
            num1 = scanner.nextInt();

            if(num1 == -1){
                break;
            }
            sum += num1;
            num2++;
        }

        while ((num1 = scanner.nextInt()) != -1 ) {
            sum += num1;
            num2++;
        }

        double average = (double) sum / num2;

        System.out.println("입력한 숫자들의 합계: "+sum);
        System.out.println("입력한 숫자들의 평균: "+average);

    }
}
