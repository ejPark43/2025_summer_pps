
package week4.pps_2025_07_22;

import java.util.Scanner;
// A197 공 바꾸기  : 공을 어떻게 바꿀지가 주어졌을 때, M번 공을 바꾼 이후에 각 바구니에 어떤 공이 들어있는지 구하는 프로그램을 작성하시오.

public class A197_ParkEunJu_20250722 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n =Integer.parseInt(s.next());
        int m =Integer.parseInt(s.next());
        int arr[] = new int[n];
        int temp =0;

        for(int i = 0; i<arr.length; i++) {
            arr[i] = i+1;
        }
        for(int j =0; j<m; j++) {
            int I = s.nextInt();
            int J = s.nextInt();
            // arr[I-1] 과  arr[J-1]의 위치를 swap
            temp = arr[I-1];
            arr[I-1] = arr[J-1];
            arr[J-1] = temp;
        }
        for(int k = 0; k<arr.length; k++)System.out.print(arr[k]+" ");
    }
}

