package 작성코드.chap05;

import java.util.Scanner;

public class Factorial_05_01 {

    public static int factorial(int num){

        if (num > 0)
            return num * factorial(num-1);
        return 1;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();

        System.out.println(num + "의 Factorial 값은 : " + factorial(num) + "입니다.");



    }


}
