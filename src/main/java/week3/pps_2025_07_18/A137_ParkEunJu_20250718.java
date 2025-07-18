package week3.pps_2025_07_18;

import java.util.Scanner;

//A137 k번째 수 : 2차원 배열을 1차원배열로 변환하여 배열안의 값을 구하는 문제
public class A137_ParkEunJu_20250718 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.next()); // 배열의 크기
        int k = Integer.parseInt(s.next()); //


        // 배열에 들어있는 수 A[i][j] = i×j

        // x 범위는  low <= x <= high
        long low = 1;
        long high = k;

        // lower-bound
        while(low < high) {

            long middle = (low + high) / 2; // 임의 값으로 절반을 만든다.
            long count = 0;
            // 임의 x값에 대해 i번재 행을 나눠서 x보다 작거나 같은 원소 개수 누적을 구한다. (각 행의 원소 개수가 열의 개수인 n을 초과하면 안된다 )
            for(int i = 1; i <= n; i++) {
                count += Math.min(middle / i, n);
            }

            if(k <= count) {
                high = middle; // k보다 count가 같거나 크다면 middle보다 작은 수가 B[k]보다 많다는 의미
            }
            else { // count가 안크면 low 는 middle + 1
                low = middle + 1;
            }
        }

        System.out.println(low);
    }
}

