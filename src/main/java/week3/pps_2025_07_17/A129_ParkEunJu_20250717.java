package week3.pps_2025_07_17;

import java.util.Scanner;

//A129 1,2,3 더하기 :정수가 주어졌을 때, 해당 정수를 1, 2, 3으로 표현하는 문제
public class A129_ParkEunJu_20250717 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.nextLine());
        int[] ans = new int[n];
        int dp[] = new int[11]; // n이 11까지이므로 ... 각 경우의 값들을 미리 계산 후 넣어준다.
        dp[1]=1; // 1
        dp[2]=2; // 1+1, 2
        dp[3]=4; // 1+1+1, 1+2, 2+1, 3

        //4부터는 1,2,3 들을 가지고 만들수 있기 때문에 해당 1,2,3들 자신들이 가질 수 있는 경우의 수를 더해서 모든 값을 구한다.
        for(int i =4; i<=10; i++) { // 4부터 반복한다
            dp[i] = dp[i-3]+dp[i-2]+dp[i-1]; // 점화식
        }

        for(int i=0; i<n; i++ ) {
            int x = Integer.parseInt(s.nextLine());
            ans[i] =dp[x];
        }
        for(int i=0; i<n; i++) {
            System.out.println(ans[i] );
        }


    }
}

