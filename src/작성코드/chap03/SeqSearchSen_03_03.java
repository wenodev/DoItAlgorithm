package 작성코드.chap03;

import java.util.Scanner;

public class SeqSearchSen_03_03 {

    private static int seqSearchSen(int[] a, int n, int key) {
        a[n] = key; // 배열의 가장 끝에 찾는값 삽입
        int i=0;
        while(true){
            if (a[i] == key) // 비교 횟수를 1회로 줄임
                break;
            i++;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();

        int[] x = new int[num+1]; // 보초를 위한 요솟수 +1

        for(int i=0; i<num; i++){ // 배열의 가장 끝은 보초를 위해 비워둔다.
            System.out.print("x[" + i + "] : " );
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = stdIn.nextInt();

        int idx = seqSearchSen(x, num, ky);

        System.out.println(ky+"는 x[" + idx + "] 에 있습니다.");
    }
}
