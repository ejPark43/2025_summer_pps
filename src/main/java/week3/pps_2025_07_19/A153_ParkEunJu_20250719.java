package week3.pps_2025_07_19;

import java.util.*;
//A153 ATM
public class A153_ParkEunJu_20250719 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n =Integer.parseInt(s.nextLine()); // 사람 수

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr); // 순서대로 정렬


        int prev = 0;	// 직전까지의 누적된 대기시간
        int sum = 0;	// 대기시간 총합

        for(int i = 0; i <n; i++) {
            // 총합 = 전까지의 대기시간 + 현재 대기시간
            sum += prev + arr[i];

            // 직전까지 대기시간 = 직전까지 대기시간 + 현재 대기시간
            prev += arr[i];
        }
        System.out.println(sum);
    }
}

