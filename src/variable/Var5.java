package variable;

import java.util.Scanner;

public class Var5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("문자열을 입력하세요:");
        String str = scanner.nextLine(); //입력을 string으로 가져온다
        System.out.println("입력한 문자열: " + str);
    }
}
