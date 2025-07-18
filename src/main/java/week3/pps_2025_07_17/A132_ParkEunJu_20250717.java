package week3.pps_2025_07_17;

import java.util.Scanner;

//A132 터렛  : 좌표 두 개가 주어졌을 때, 해당 좌표에 따라 있을 수 있는 위치의 수를 구하는 문제
public class A132_ParkEunJu_20250717 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        int T = Integer.parseInt(s.nextLine());

        int[] ans = new int[T];
        for(int i = 0; i<T; i++) {

            int x1 = s.nextInt();
            int y1 = s.nextInt();
            int r1 = s.nextInt();

            int x2 = s.nextInt();
            int y2 = s.nextInt();
            int r2 = s.nextInt();

            ans[i] = tangent_point(x1, y1, r1, x2, y2, r2);
        }
        for(int i=0; i<T; i++) {
            System.out.println(ans[i]);
        }

    }


    // 접점 개수 함수
    public static int tangent_point(int x1, int y1, int r1, int x2, int y2, int r2) {

        int distance_pow = (int)(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));	// 중점간 거리 distance의 제곱
        // 중점 같고 반지름도 같은경우
        if(x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }
        //두 원의반지름 합보다 중점 끼리의 거리가 더 클때
        else if(distance_pow > Math.pow(r1 + r2, 2)) {
            return 0;
        }
        //원 안에 원이 들어있지만 내접 X
        else if(distance_pow < Math.pow(r2 - r1, 2)) {
            return 0;
        }
        //내접할때
        else if(distance_pow == Math.pow(r2 - r1, 2)) {
            return 1;
        }

        // 외접할때
        else if(distance_pow == Math.pow(r1 + r2, 2)) {
            return 1;
        }

        else {
            return 2;
        }

    }
}

