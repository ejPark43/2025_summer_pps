package pps_2025_07_08;

import java.util.Scanner;
//A019 숫자의 개수 : 세 개의 자연수 A, B, C가 주어질 때 A × B × C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 구하는 문제
public class A019_ParkEunJu_20250708 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int num;
        num = s.nextInt();// 들어오자마자 바로 곱해서 적용
        num *=s.nextInt();
        num *=s.nextInt();

        int[] numbers = new int[10];

        do{
            numbers[num%10] +=1;
            if(num>=1)
                num = num/10;
            else break;
        }while(num>=1);

        for(int i=0; i<=9; i++) {
            System.out.println(numbers[i]);
        }
    }
}
