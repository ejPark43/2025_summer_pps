
package week4.pps_2025_07_25;

import java.util.*;

//B032 이장님 초대 (묘목 사서 다 자란날 며칠에 이장님을 초대할 수 있는가 )
public class B032_ParkEunJu_20250725 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine()); // 묘목의 수

        int count = 2; // 묘목 구매하는날 +1 , 다 자란날 +1 해서 2일을 가지고 시작함.
        int res = 0;
        Integer arr[] = new Integer[n];
        for(int i =0; i<n; i++) { // 묘목 개수만큼 입력받아옴
            arr[i] = s.nextInt();
        }

        Arrays.sort(arr,Collections.reverseOrder()); // 내림차순으로 정렬

        for(int i=0; i<n; i++) {
            res = Math.max(res, count+arr[i]);
            count++;
        }
        System.out.println(res);
    }

}

