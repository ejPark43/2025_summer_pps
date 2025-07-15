package week3.pps_2025_07_15;

import java.util.Scanner;

//A127 최소공배수 :두 수의 최소공배수를 구하는 문제
public class A127_ParkEunJu_20250715 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.nextLine()); // test case
        int[] ans = new int[n]; // 정답 넣을 배열
        for(int i = 0; i<n; i++) {

            int a =  Integer.parseInt(s.next());
            int b =  Integer.parseInt(s.next());
            int d =  gcd(a,b); // 유클리드 호제법 메서드 생성

            ans[i] = a*b/d;
        }

        for(int i = 0; i<n; i++) {
            System.out.println(ans[i]);
        }

    }
    public static int gcd(int a, int b){ // 유클리드 호제법

        if(b==0) return a; // b가 0이면 a를 그대로 리턴
        else return gcd(b, a%b); // 위 경우가 아닐 시 재귀로..


    }
}
