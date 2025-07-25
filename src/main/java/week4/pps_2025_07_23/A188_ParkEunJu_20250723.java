
package week4.pps_2025_07_23;

import java.util.Scanner;

//A188 사분면 고르기
public class A188_ParkEunJu_20250723 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int x = Integer.parseInt(s.nextLine());
        int y = Integer.parseInt(s.nextLine());

        if(x>0&&y>0)System.out.println("1"); // 둘다 양수
        else if(x>0) System.out.println("4"); // x만 양수
        else if(y>0) System.out.println("2"); // y만 양수
        else System.out.println("3"); // 둘다 음수


    }
}

