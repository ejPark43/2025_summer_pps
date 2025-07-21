package week3.pps_2025_07_20;

import java.util.Scanner;

//A155 랜선 자르기
public class A155_ParkEunJu_20250720 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        int k = s.nextInt(); // 갖고 있는 랜선 개수
        int n = s.nextInt(); // 필요한 랜선 개수
        int[] arr = new int[k];  // 들어오는 랜선(개수값이 들어온다)

        long max = 0;


        for (int i = 0; i < k; i++) {
            arr[i] = s.nextInt();
            if(max < arr[i]) {		// 입력 받을때 랜선이 최대인지를 바로 확인한다
                max = arr[i];
            }
        }

        // max+1
        max++;

        long min = 0; // 탐색 길이의 최솟값
        long mid = 0;

        while (min < max) {

            mid = (max + min) / 2;	//중간 길이를 구한다.


            long count = 0;

            // 중간 길이로 자르면 총 몇개의 랜선이 만들어지는지 확인
            for (int i = 0; i < arr.length; i++) {
                count += (arr[i] / mid);
            }

            if(count < n) {
                max = mid;
            }
            else {
                min = mid + 1;
            }


        }
        // upperbound에서-1한 값이 정답이 된다.
        System.out.println(min - 1);
    }
}

