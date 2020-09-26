package 작성코드.chap04;

import java.util.Scanner;

public class IntQueueTester_04_04 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        final int MAX = 64;
        IntQueue_04_03 intQueue = new IntQueue_04_03(MAX);

        while (true){

            System.out.println("현재 데이터 수 : " + intQueue.size() + "/" + MAX );
            System.out.print("(1)인큐 (2)디큐 (3)피크 (4)덤프 (0)종료 : ");
            int select = sc.nextInt();

            if (select == 0) break;

            switch (select){
                case 1:
                    System.out.print("데이터 : ");
                    int temp = sc.nextInt();
                    intQueue.enqueue(temp);
                    break;
                case 2:
                    System.out.println("디큐한 데이터는 : " + intQueue.deque() + " 입니다.");
                    break;
                case 3:
                    System.out.println("피크한 데이터는 : " + intQueue.peek() + "입니다.");
                    break;
                case 4:
                    intQueue.dump();
                    break;
                default:
                    System.out.println("다시 입력하세요");
                    break;
            }
        }
    }
}




