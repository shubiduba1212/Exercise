package scanner.ex;
import java.util.Scanner;

public class ScannerEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("하나의 정수를 입력하세요:");
        int intValue = scanner.nextInt();

        String oddEvenValue = (intValue % 2) == 0 ? "짝수" : "홀수";

        System.out.println("입력한 숫자 "+ intValue +"는 "+oddEvenValue+"입니다.");
    }
}
