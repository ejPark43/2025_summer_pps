package pps_2025_07_09;

import java.util.Scanner;

// A031 초콜릿 자르기 : 초콜릿의 크기가 주어졌을 때, 이를 1×1 크기의 초콜릿으로 쪼개기 위한 최소 쪼개기 횟수를 구하는 문제
public class A031_ParkEunJu_20250709 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int n= s.nextInt();
        int m=s.nextInt();
        System.out.println(n*m-1);
    }


}
