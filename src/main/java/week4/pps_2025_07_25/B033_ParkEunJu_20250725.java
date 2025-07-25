
package week4.pps_2025_07_25;

import java.util.Scanner;

//B033 전자레인지: 3개의 시간 조절용 버튼 A B C가 달린 전자레인지가 있다. 주어진 요리시간 T초를 맞추기 위한 최소버튼 조작 방법을 구하는 프로그램을 작성.
public class B033_ParkEunJu_20250725 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());

        int a = n/300; // 5분
        n%=300;
        int b = n/60; //1분
        n%=60;
        int c = n / 10; // 10초
        n %= 10;

        if(n != 0) {
            System.out.println(-1);
        } else {
            System.out.println(a+" "+b+" "+c);
        }


    }
}

