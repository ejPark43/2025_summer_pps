package week3.pps_2025_07_20;

import java.util.Scanner;

//A156 나무 자르기 (랜선 자르기와 비슷한 문제)
public class A156_ParkEunJu_20250720 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int N = s.nextInt(); // 들어올 나무의 개수
        int M = s.nextInt(); // 나눠야 하는 나무의 수

        int[] tree = new int[N];

        int min = 0;
        int max = 0;

        for(int i = 0; i < N; i++) {
            tree[i] = s.nextInt();
            if(max < tree[i]) { // 들어온 나무들 중에서 최대값 찾기
                max = tree[i]; // 최대값 찾으면 갱신한다
            }
        }

        // upper bound
        while(min < max) {

            int mid = (min + max) / 2;
            long sum = 0;
            for(int treeHeight : tree) {

                if(treeHeight - mid > 0) {
                    sum += (treeHeight - mid);
                }
            }

            if(sum < M) {
                max = mid;
            }
            else {
                min = mid + 1;
            }
        }

        System.out.println(min - 1);


    }
}

