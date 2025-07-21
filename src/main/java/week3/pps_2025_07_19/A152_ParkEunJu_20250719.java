package week3.pps_2025_07_19;

import java.util.Scanner;
import java.util.StringTokenizer;

//A152 계단 오르기  (각 숫자가 적힌 계단을 오르면서 합하는 모든 경우 중 총 점수의 최댓값 )
public class A152_ParkEunJu_20250719 {
    static Integer dp[];
    static int arr[];

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.nextLine()); // 계단 개수
        dp = new Integer[n+1];
        arr = new int[n+1];

        for(int i =1; i<=n; i++) { // 들어오는 각 계단의 값들
            arr[i] = s.nextInt();
        }

        dp[0] = arr[0]; // 디폴트값을 0으로 초기화해준다. (dp는 디폴트값이 null로 되어있음)
        dp[1] = arr[1];

        if(n >= 2) {
            dp[2] = arr[1] + arr[2];
        }

        System.out.println(find(n));

    }

    static int find(int n) {
        // 아직 방문하지 않는 n번째 계단일 때
        if(dp[n] == null) 	dp[n] = Math.max(find(n - 2), find(n - 3) + arr[n - 1]) + arr[n];


        return dp[n];
    }
}

