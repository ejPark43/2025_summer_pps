
package week4.pps_2025_07_22;

import java.util.Scanner;
// A195 별찍기 : 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제

public class A195_ParkEunJu_20250722 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for(int i=1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

