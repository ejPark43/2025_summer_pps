package pps_2025_07_10;

import java.util.Scanner;

// A033 나는 요리사다: 총 다섯 개 줄에 각 참가자가 얻은 네 개의 평가 점수가 공백으로 구분되어 주어진다. 우승자의 번호와 그가 얻은 점수를 출력하는 문제
public class A033_ParkEunJu_20250709 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);
        int max = 0;
        int index=0;

        for(int i=0; i<4; i++)
            max+=s.nextInt();

        for(int i =1; i<5; i++){
            int temp=0;
            for(int j = 0; j<4; j++){
                temp+=s.nextInt();
            }
            if(max<temp){
                max = temp;
                index=i;
            }
        }
        System.out.printf("%d %d", index+1, max);
    }


}
