package pps_2025_07_08;

import java.util.*; // Arrays사용하기 위해 선언
//A018 보물: 정수 배열 A와 B의 각 값을 곱하는 프로그램이다. 결과 값을 가장 작게 만들기 위해 A의 수를 재배열 하여 최솟값을 출력하는 문제
public class A018_ParkEunJu_20250708 {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int n = s.nextInt(); // 입력받는 n
        int[] A = new int[n]; // A 배열 생성
        int[] B =new int[n]; // B 배열 생성

        for(int i=0; i<n; i++) A[i]= s.nextInt(); // A 배열에 들어갈 숫자들 넣어줌
        for(int j=0; j<n; j++) B[j]= s.nextInt(); // B 배열에 들어갈 숫자들 일단 넣어줌
        Arrays.sort(A); // A 정렬
        Arrays.sort(B);// B 정렬
        int sum=0; // 더한 최소값 출력할 변수

        for(int k=0; k<n; k++)  sum+=A[k]*B[n-1-k]; // A는 앞에서부터, B는 뒤에서부터 곱하면 최소값을 만들 수 있다.

        System.out.println(sum); // 더한 최솟값 출력


    }
}
