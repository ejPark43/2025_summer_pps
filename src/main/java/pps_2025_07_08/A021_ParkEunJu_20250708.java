package pps_2025_07_08;

import java.util.Scanner;
// A021 플러그 : 하나의 플러그가 있고, N개의 멀티탭이 있다. 각 멀티탭은 몇 개의 플러그로 이루어져 있다고 한다. 최대 몇 대의 컴퓨터를 전원에 연결할 수 있는지 출력하는 문제
public class A021_ParkEunJu_20250708 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); //맨 처음 N
        int sum = 0; // 연결가능한 컴퓨터 개수
        for(int i=0; i<n; i++){
            sum+=s.nextInt();   // 각 멀티탭의 플러그 수를 다 더함
        }
        System.out.println(sum-(n-1)); //마지막 멀티탭을 제외한 각 멀티탭마다 한 플러그는 사용할 수 없다. 즉, n-1개의 플러그는 사용불가함.
        //=> 답은 모든 플러그 더한 수 - (n-1)

    }
}
