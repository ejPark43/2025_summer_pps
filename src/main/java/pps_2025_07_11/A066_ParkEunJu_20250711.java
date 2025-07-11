package pps_2025_07_11;

import java.util.*;

// A066 소트인사이드 : 주어진 수의 각 자리수를 내림차순으로 정렬하는 문제.

public class A066_ParkEunJu_20250711 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String n = s.next();
        int m = n.length(); // string의 길이를 m에 넣음
        int num = Integer.parseInt(n);
        int [] sortArr = new int[m];

        for(int i = 0; i<m; i++){
            sortArr[i] = num%10; // %10하면 맨 뒤 숫자인 나머지가 나옴. 그걸 배열에 집어넣고 10 나눠줌.
            num/=10;

        }
        Arrays.sort(sortArr); // 배열 내용 sort. 오름차순
        for(int i=m-1; i>=0; i--) // 여기서 내림차로 출력해줌
            System.out.printf("%d",sortArr[i]);

    }
}
