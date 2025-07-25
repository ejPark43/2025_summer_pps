
package week4.pps_2025_07_25;

import java.math.BigInteger;
import java.util.Scanner;

//B077 피보나치 수 : 정수를 입력받아 해당 정수의 피보나치수를 출력하는 문제
public class B077_ParkEunJu_20250725 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine());// 입력받을 정수
        BigInteger[] dp = new BigInteger[n+1]; // 저장하게될 숫자가 엄청 커지기 때문에 BigInteger로 만듦.

        dp[0] = BigInteger.valueOf(0);
        dp[1] = BigInteger.valueOf(1);

        if(n>1) dp[2] = BigInteger.valueOf(1);
        for(int i =3; i<=n;i++) {
            dp[i] = dp[i-1].add(dp[i-2]);
        }

        System.out.println(dp[n]);
    }

}

