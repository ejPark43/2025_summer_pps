package pps_2025_07_11;

import java.util.*;

// A077 점수 계산 : 참가자의 8개 문제 점수가 주어졌을 때, 총 점수를 구하는 프로그램
public class A077_ParkEunJu_20250711 {

    public static void main(String args[]) {
        //A077 점수 계산
        Scanner s = new Scanner(System.in);
        int[][] arr = new int[8][2];
        int[] ans = new int[5];

        for(int i=0; i<8; i++) {
            arr[i][0]= Integer.parseInt(s.next()); // i번째의 0번째 에는 점수 넣음
            arr[i][1] = i+1; // i번째의 1번째에는 몇번 문제 점수인지 넣음
        }
        Arrays.sort(arr, (int[] a, int[] b) -> { // 점수 기준으로 저장
            return b[0] - a[0];
        });


        int sum = 0;
        for(int i=0; i<5; i++) { // 다섯개 점수
            sum+=arr[i][0];
            ans[i]=arr[i][1]; // 높은 점수 다섯개 저장
        }
        Arrays.sort(ans); // 높은 점수 다섯개를 오름차순으로 정렬
        System.out.println(sum);
        for(int i=0; i<5; i++) {
            System.out.println(ans[i]);
        }

    }
}
