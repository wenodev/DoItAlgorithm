package 작성코드.chap04;

public class IntQueue_04_03 {

    private int max;
    private int front;
    private int rear;
    private int num;
    private int[] que;


    // 실행 시 예외 : 큐가 비어있음
    public class EmptyIntQueueException extends RuntimeException{
        public EmptyIntQueueException(){}
    }

    // 실행 시 예외 : 큐가 가득 참
    public class OverflowIntQueueException extends RuntimeException{
        public OverflowIntQueueException() {}
    }

    // 생성자
    public IntQueue_04_03(int capacity){

        num = front = rear = 0;
        max = capacity;
        try{
            que = new int[max];
        } catch (OutOfMemoryError e){
            max = 0;
            System.out.println(e);
        }

    }

    // 인큐
    public int enqueue(int x) throws OverflowIntQueueException{

        if (num >= max)
            throw new OverflowIntQueueException();
        que[rear++] = x;
        num++;
        if (rear == max)
            rear = 0;
        return x;
    }










    public static void main(String[] args) {

    }
}
