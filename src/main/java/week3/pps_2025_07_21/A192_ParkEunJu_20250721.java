package week3.pps_2025_07_21;

import java.util.Scanner;

//A192 1~n 합 : n이 주어졌을 때, 1부터 n까지 합을 구하는 프로그램을 작성하시오.
public class A192_ParkEunJu_20250721 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        String input = s.next();
        int n = Integer.valueOf(input);
        int ans = 0;
        for(int i=1; i<=n; i++){
            ans +=i;
        }
        System.out.println(ans);



    }
}

