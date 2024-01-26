package scanner;
import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("첫번째 입력한 숫자는:");
            int num1 = scanner.nextInt();

            System.out.print("두번째 입력한 숫자는:");
            int num2 = scanner.nextInt();

            if(num1 == 0 && num2 == 0){
                break;
            }else{
                int sum = num1 + num2;
                System.out.println("두 숫자를 더한 값:"+sum);
            }
        }
        System.out.println("프로그램을 종료합니다.");
    }
}
