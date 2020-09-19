package 작성코드.chap04;

import java.util.Scanner;

public class Practice04 {

    public static class IntAryQueue{
        private int max;
        private int num;
        private int[] que;

        public IntAryQueue(int max){
            this.num = 0;
            this.max = max;
            this.que = new int[max];
        }

        public void enqueue(int data){
            if (num < max){
                que[num] = data;
                num++;
            }else{
                System.out.println("큐의 용량을 초과했습니다.");
                return;
            }
        }

        public void dequeue(){
            if (num > 0){
                for (int i=0; i<num; i++){
                    que[i] = que[i+1];
                }
            }else{
                System.out.println("큐가 비어있습니다.");
                return;
            }
        }

        public void dump(){
            for(int i=0; i<num; i++){
                System.out.print(que[i] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("큐 용량 : ");
        int max = stdIn.nextInt();

        IntAryQueue intAryQueue = new IntAryQueue(max);

        while (true){
            System.out.print("[1]인큐 [2]디큐 [3]덤프 [0] 종료 : ");
            int control = stdIn.nextInt();

            switch (control){
                case 1:
                    int data = stdIn.nextInt();
                    intAryQueue.enqueue(data);
                    break;
                case 2:
                    intAryQueue.dequeue();
                    break;
                case 3:
                    intAryQueue.dump();
                    break;
                default:
                    break;
            }
            if (control == 0) break;
        }
    }
}
