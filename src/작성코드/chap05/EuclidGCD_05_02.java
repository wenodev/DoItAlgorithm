package 작성코드.chap05;

import java.util.Scanner;

public class EuclidGCD_05_02 {


    public static int euclid(int x, int y){

        if (y == 0)
            return x;
        else
            return euclid(y, x%y);
    }



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("첫번째 정수 입력 : ");
        int num1 = sc.nextInt();

        System.out.print("두번째 정수 입력 : ");
        int num2 = sc.nextInt();

        System.out.println("두 수의 최대 공약수는 " + euclid(num1,num2) + "입니다.");

    }
}
