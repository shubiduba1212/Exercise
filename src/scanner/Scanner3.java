package scanner;
import  java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째 입력한 숫자:");
        int num1 = scanner.nextInt();

        System.out.print("두번째 입력한 숫자:");
        int num2 = scanner.nextInt();

        if(num1 > num2){
            System.out.print("첫번째 입력한 숫자 " + num1 + "이/가 더 큰 숫자입니다.");
        }else if(num2 > num1){
            System.out.print("두번째 입력한 숫자 " + num2 + "이/가 더 큰 숫자입니다.");
        }else{
            System.out.print("두 숫자가 같습니다.");
        }

    }
}
