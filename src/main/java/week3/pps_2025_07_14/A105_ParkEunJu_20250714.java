package week3.pps_2025_07_14;

import java.util.Arrays;
import java.util.Scanner;

//A105 분수찾기  : 주어진 규칙에 맞게 배열에 분수를 저장하고, 규칙에 맞게 배열을 탐색

public class A105_ParkEunJu_20250714 {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());


        int diag = 1; // 대각선에 있는 내용 개수
        int prevSum=0; // 누적한 개수

        while(true) {
            if(n<= prevSum+diag) { // 이 반복 직전 대각선 누적값+해당 대각선 개수
                if(diag %2==1) {// 대각선 내용 개수가 홀수일때
                    System.out.println((diag-(n-prevSum-1))+"/"+(n-prevSum));
                    break;
                }
                else {//대각선에 들어있는 개수가 짝수일때
                    System.out.println((n-prevSum)+"/"+(diag-(n-prevSum-1)));
                    break;
                }


            }else {//정해진 범위에 오지않았으면 계속 더한다.
                prevSum+=diag;
                diag++;
            }
        }
    }

}
