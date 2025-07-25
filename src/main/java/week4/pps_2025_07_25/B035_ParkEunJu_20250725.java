
package week4.pps_2025_07_25;

import java.util.Scanner;

// B035 동전 0 : 동전의 종류와 동전의 총합이 주어질때, 최소가 되는 동전 개수를 구하는 문제

public class B035_ParkEunJu_20250725 {

    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k= s.nextInt();
        int[] coins = new int[n];

        for(int i = 0; i < n; i++) {
            coins[i] = s.nextInt();
        }

        int count = 0;
        for(int i = n - 1; i >= 0; i--) {

            // 현재 동전의 가치가 K보다 작거나 같아야지 구성가능하다.
            if(coins[i] <= k) {
                // 현재 가치의 동전으로 구성할 수 있는 개수를 더해준다.
                count += (k / coins[i]);
                k = k % coins[i];
            }
        }
        System.out.println(count);
    }
}

