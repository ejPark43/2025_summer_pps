package pps_2025_07_08;

import java.util.Scanner;
// A017 방 번호:방 번호 N을 만들기 위해 필요한 숫자 세트의 개수를 구하는 문제. 단, 6과 9는 뒤집어서 서로로 이용할 수 있다.
public class A017_ParkEunJu_20250708 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // 들어온 숫자
        int [] indexs = new int[10]; // 각 숫자들이 몇개 필요한지 확인하는 배열
        int max = -1;

        for(int i=n; i>=1; i/=10) {
            if(i%10==6) indexs[9]++;
            else indexs[i%10]++;
            if((i%10 !=9)&&max<=indexs[i%10]) max = indexs[i%10];
        }
        int sixnine = indexs[9]/2;
        if(indexs[9]%2==1) sixnine++;

        if(max<sixnine) max = sixnine;
        System.out.println(max);

    }
}
