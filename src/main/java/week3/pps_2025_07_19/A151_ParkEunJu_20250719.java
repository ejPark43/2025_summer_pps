package week3.pps_2025_07_19;

import java.util.*;

//A151 정수 삼각형
public class A151_ParkEunJu_20250719 {

    //다른 메서드에서 쓰기위해서 main 함수 밖에 선언
    static int n;
    static int[][] arr;
    static Integer[][] dp; //


    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        n = Integer.parseInt(s.nextLine());

        arr = new int[n][n]; // 숫자 들어가는 배열
        dp = new Integer[n][n]; // 각 숫자 더해서 최대값을 찾아줄 dp

        StringTokenizer stk;
        for(int i=0; i<n; i++) {
            stk = new StringTokenizer(s.nextLine(), " "); // 받아온 줄에서 공백으로 토큰들 분리
            for(int j =0; j<i+1; j++) {
                arr[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
        for(int i = 0; i<n; i++) { // dp의 맨 마지막 줄, (=leaf node들) 에는 arr 값을 그대로 넣어줌. (아래에서 위로 올라가면서 더할거라서..)
            dp[n-1][i] = arr[n-1][i];
        }
        System.out.println(sum(0,0));

    }

    static int sum(int a, int b) { // 재귀함수로.
        if(a == n-1) return dp[a][b];

        if(dp[a][b]==null) dp[a][b] = Math.max(sum(a+1,b), sum(a+1,b+1))+arr[a][b];

        return dp[a][b];
    }


}

