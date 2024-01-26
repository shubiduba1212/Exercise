package scanner.ex;
import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단 수를 입력해주세요:");
        int num = scanner.nextInt();

        int num2 = 1;

        System.out.println(num + "단의 구구단:");

        while (num2 < 10) {
            System.out.println(num+" × "+num2+" ＝ "+(num*num2));
            num2++;
        }
    }
}
