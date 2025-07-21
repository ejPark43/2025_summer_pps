package week3.pps_2025_07_20;

import java.util.*;

//A157 공유기
public class A157_ParkEunJu_20250720 {
    public static int[] house;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int n = Integer.parseInt(s.next());
        int m = Integer.parseInt(s.next());


        house = new int [n]; // n개 만큼의 집 생성

        for(int i = 0; i < n; i++) {
            house[i] = s.nextInt();
        }

        Arrays.sort(house);	 // 이진탐색(Binary search)을 하기위해서  값을 정렬한다.
        int low = 1; // 최소 거리가 가질수있는 최소
        int high = house[n-1]-house[0]+1; // 최소 거리가 가질수있는 최대

        while(low < high) {	// Upper Bound 형식

            int mid = (low+high) / 2;


            if(installOk(mid) < m) {
                high = mid;
            }
            else {
                // 설치 가능한 게 m보다 같거나 크면 거리를 벌리면서 최소 거리가 가질 수 있는 최대 거리를찾는다.
                low = mid + 1;
            }
        }
        System.out.println(low - 1);
    }
    public static int installOk(int d) {
        int count = 1; // 첫 번째 집은 공유기 설치를 바로 한다
        int lastPlace = house[0];

        for(int i =1; i<house.length; i++) {
            int place = house[i];
            // 지금 탐색중인 집과 직전에 설치한 집의 위치 거리가 최소(=d)보다 크거나 같으면 공유기의 설치 개수를 늘린다.

            if(place - lastPlace >=d) {
                count++;
                lastPlace = place; // 마지막 위치를 갱신해줌.
            }

        }
        return count;
    }


}

