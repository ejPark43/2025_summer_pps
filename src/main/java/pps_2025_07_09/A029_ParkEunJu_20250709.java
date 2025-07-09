package pps_2025_07_09;

import java.util.Scanner;

// A029 문문문 : 문을 규칙에 맞는 방법으로 열어야하도록 시스템을 구성하였다.  문의 개수를 입력받고 문을 여는 방법을 한줄에 하나씩 출력한다.
public class A029_ParkEunJu_20250709 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n =Long.parseLong(s.next());
        int start =Integer.parseInt(s.next());
        if(n>=6) {
            System.out.println("Love is open door");
            return;
        }
        else
            for(int i=1; i<n; i++) {
                if(start==0) start++;
                else if(start==1) start--;
                System.out.println(start);

            }
    }

}
