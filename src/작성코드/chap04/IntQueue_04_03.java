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

    //디큐
    public int deque() throws EmptyIntQueueException{
        if (num <= 0)
            throw new EmptyIntQueueException();
        int x = que[front++];
        num--;
        if (front == max)
            front = 0;
        return x;
    }

    //피크
    public int peek() throws EmptyIntQueueException{
        if(num <= 0)
            throw new EmptyIntQueueException();
        return que[front];
    }

    //인덱스 찾기
    public int indexOf(int x){
        for (int i=0; i<num; i++){
            int idx = (i + front) % max;
            if (que[idx] == x)
                return idx;
        }
        return -1;
    }

    //큐를 비움
    public void clear(){
        num = front = rear = 0;
    }

    //큐의 용량을 반환
    public int capacity(){
        return max;
    }

    //큐에 쌓여 있는 데이터 수를 반환
    public int size(){
        return num;
    }

    //큐가 비어있는지 확인
    public boolean isEmpty(){
        return num <= 0;
    }

    //큐가 가득 찼는지 확인
    public boolean isFull(){
        return num >= max;
    }

    // 큐의 모든 데이터를 프런트->리억 순으로 출력
    public void dump(){
        if (num <= 0)
            System.out.println("큐가 비었습니다.");
        else{
            for (int i=0; i<num; i++)
                System.out.println(que[(i+front) % max] + " ");
            System.out.println();
        }
    }















    public static void main(String[] args) {

    }
}
