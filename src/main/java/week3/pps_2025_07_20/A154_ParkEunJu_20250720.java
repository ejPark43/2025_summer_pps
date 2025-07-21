package week3.pps_2025_07_20;

import java.util.Scanner;

//A154 주유소 (도시에서 다른 도시까지 도착하는 총 비용을 최소화)
public class A154_ParkEunJu_20250720 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);


        int n =Integer.parseInt(s.nextLine()); //도시 개수

        long[] dist = new long[n - 1];	// 도시의 거리 넣을  배열
        long[] cost = new long[n];	// 비용 넣을 배열

        // 거리 받아옴
        for(int i = 0; i < n - 1; i++) {
            dist[i] = s.nextLong();
        }

        // 리터당 기름값을 입력받아옴
        for(int i = 0; i < n; i++) {
            cost[i] = s.nextLong();
        }

        long sum = 0;
        long minCost = cost[0];	// 직전까지의 과정 중 가장 최소 비용

        for(int i = 0; i < n - 1; i++) {

            if(cost[i] < minCost) { // 만약 더 최소 비용이 나온다면 minCost를 갱신
                minCost = cost[i];
            }

            sum += (minCost * dist[i]);	// 총 비용 누적 합
        }

        System.out.println(sum);


    }
}

