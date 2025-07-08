package pps_2025_07_08;

import java.util.Scanner;
// A020 지능형 기차 : 4개의 역에 대해 기차에서 내린 사람 수와 탄 사람 수가 주어졌을 때, 기차에 사람이 가장 많을 때의 사람 수를 계산하는 문제
// 다른 사람 코드 참고함
public class A020_ParkEunJu_20250708 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int max;
        int[] counts = new int [6];
        int sum = s.nextInt();
        max = sum;
        for(int i=0; i<6; i++){
            if(i%2==0){
                sum+=s.nextInt();
            }
            else{
                sum-=s.nextInt();
            }
            counts[i] = sum;
            if(counts[i]>=max) max = counts[i];
        }
        System.out.println(max);
    }
}
