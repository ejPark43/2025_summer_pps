package week3.pps_2025_07_15;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//A126 한수 찾기 (n보다 작은 '각 자릿수가 등차수열인 숫자'의 개수 찾기)  :각 자리가 등차수열을 이루는 수인 한수의 개수를 출력하는 문제
public class A126_ParkEunJu_20250715 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.nextLine());

        int count = 0; // 한수 개수 셈
        if(n<100) System.out.println(n); // 1~99까지는 어차피 모두 등차수열이므로 개수는 자기자신과 같음
        else {
            count = 99; //n이 100일때는 n보다 작은 등차수열의 개수는  99로 시작함.
            for(int i=100; i<=n; i++) {
                int h = i/100; // 100 자리수
                int t = (i/10)%10; // 10 자리
                int o = (i%10); // 1 자리
                if((h-t) == (t-o)) {
                    count++;
                }

            }
            System.out.println(count);
        }

    }
}
