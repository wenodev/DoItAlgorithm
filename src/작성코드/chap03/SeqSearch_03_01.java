package 작성코드.chap03;

import java.util.Scanner;

public class SeqSearch_03_01 {

    private static int seqSearch(int[] a, int n, int key) {
        int i=0;
        while(true) {
            if (i == n) return -1;
            if (a[i] == key) return i;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i=0; i<num; i++){
            System.out.print("x[" + i + "] : " );
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값 : ");
        int ky = stdIn.nextInt();

        int idx = seqSearch(x, num, ky);

        System.out.println(ky+"는 " + "x[" + idx + "] 에 있습니다.");
    }
}

//    private static int seqSearch(int[] a, int n, int key) {
//
//        for(int i=0; i<n; i++){
//            if (a[i] == key){
//                return i;
//            }
//        }
//        return -1;
//    }