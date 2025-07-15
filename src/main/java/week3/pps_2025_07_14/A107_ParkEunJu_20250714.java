package week3.pps_2025_07_14;

import java.util.Scanner;

//A107 쉽게 푸는 문제 : 주어진 규칙에 맞게 배열을 만들고 그 배열에서 부분합을 구하는 문제

public class A107_ParkEunJu_20250714 {
    // 1 2 2 3 3 3 4 4 4 4 .... 에서 주어진 범위 내 숫자들 더하기.
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int[] arr = new int[1002]; // 1~1000개 까지 넣을 수 있어야함
        int a = 1;
        for(int i =1; i<=1000; i++) {

            for(int j=1; j<=i; j++){ // j는 1부터 i까지임. i=4라면 j 는 1부터 4까지 4개
                if(a>1000) break; // 만약 a가 1000을 넘게되면 중지
                arr[a]=i; // 배열에 i를 넣어줌. a가 1번부터 1000번까지를 넣을것임..
                a++;
            }

        }
        int x = s.nextInt();
        int y = s.nextInt();
        int sum=0;
        for(int z = x; z<=y; z++) {
            sum+=arr[z];
        }

        System.out.println(sum);
    }

}
