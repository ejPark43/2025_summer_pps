
package week4.pps_2025_07_25;

import java.util.Scanner;
//B031 라디오
public class B031_ParkEunJu_20250725 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int a = Integer.parseInt(s.next()); // 현재  주파수
        int b = Integer.parseInt(s.next()); // 듣고싶은 주파수
        int n = Integer.parseInt(s.next()); // 즐겨찾기 주파수 개수
        int min = Math.abs(a-b); // 현재주파수 - 듣고싶은 주파수

        for(int i =0; i<n; i++) {
            int favorite = Integer.parseInt(s.next());
            min = Math.min(Math.abs(b-favorite)+1, min);
        }
        System.out.println(min);

    }

}

