package 작성코드.chap03;

import java.util.Scanner;

public class BinSearch_03_04 {

    private static int binSearch(int[] x, int num, int key) {
        int pl = 0;
        int pr = num-1;

        do {
            int pc = (pl+pr) / 2;
            if (x[pc] == key) return pc;
            else if (x[pc] > key){
                pr = pc-1;
            }else{
                pl = pc+1;
            }
        }while(pl <= pr);

        return -1;
    }

    public static void main(String[] args) {
        Scanner stdId = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int num = stdId.nextInt();

        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요.");

        System.out.print("x[0] : " );
        x[0] = stdId.nextInt();

        for (int i=1; i<num; i++){
            do{
                System.out.print("x[" + i + "] : " );
                x[i] = stdId.nextInt();
            }while(x[i] < x[i-1]);
        }

        System.out.print("검색할 값 : ");
        int key = stdId.nextInt();
        int idx = binSearch(x, num, key);

        System.out.println(key +"는 x[" + idx + "]에 있습니다.");
    }
}
