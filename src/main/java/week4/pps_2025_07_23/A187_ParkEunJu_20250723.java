
package week4.pps_2025_07_23;

import java.util.Scanner;
//A187 윤년계산
public class A187_ParkEunJu_20250723 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int y = s.nextInt();

        // "4의 배수이면서 100의 배수가 아닐 때" 혹은 "400의 배수일때"
        if((y%4==0)&&(y%100!=0) ||y%400==0) System.out.println("1");
        else System.out.println("0");
    }

}

