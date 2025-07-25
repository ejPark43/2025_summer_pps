
package week4.pps_2025_07_23;

import java.util.Scanner;

//A189 알람시계
public class A189_ParkEunJu_20250723 {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);

        int h = Integer.parseInt(s.next());
        int m = Integer.parseInt(s.next());

        if(m>=45) { //현재 분이 45분과 같거나 클때는 그냥 뺌

            System.out.printf("%d %d",h, m-45);

        }else { // 현재 분이 45분보다 작을때
            if(h==0) h=24; // 0시라면 시간 바꿔줌
            System.out.printf("%d %d", h-1, 60+m+-45); // (시간-1), (분-45+60) 출력
        }
    }
}

