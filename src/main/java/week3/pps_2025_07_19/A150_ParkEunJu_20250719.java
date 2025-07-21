package week3.pps_2025_07_19;

import java.util.Scanner;

//A150 연속합 (연속된 값을 더했을때 가장 최대값이 무엇인지)
public class A150_ParkEunJu_20250719 {


    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.nextLine());
        int[] numarr = new int[n];
        int[] dp = new int[n];
        // numarr[]에는 	10 -4  3  1  5  6 -35  12 21 -1 이란
        // dp[]에는 : 	10  6  9  10 15 21 -14   12 33 32 란 값들이 이위치에서의 최대값이다. (연속된숫자들 더했을때 그 위치가 가질 수 있는 가장 큰 경우만 적음)
        int max=0;
        for(int i =0; i<n; i++) {
            numarr[i]=Integer.parseInt(s.next());
        }

        dp[0] = numarr[0];
        max = numarr[0];
        for(int i=1; i<n; i++) {
            dp[i]=Math.max(dp[i-1]+numarr[i], numarr[i]); //dp[0]+numarr[1]과 numarr[1] 비교해서 더큰 값을 dp[1]에 넣음. 이걸 반복...
            max = Math.max(max, dp[i]);
        }
        System.out.println(max);
    }
}

