
package week4.pps_2025_07_22;


import java.util.Scanner;
// A193 코딩은 체육과목 : 혜아가 N 바이트 정수까지 저장할 수 있다고 생각해서 칠판에 쓴 정수 자료형의 이름은 무엇일까?

public class A193_ParkEunJu_20250722 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine()); // n값
        String str = "";
        for(int i =1; i<=n/4; i++) {
            str+="long ";
        }
        System.out.println(str +"int");

    }
}

