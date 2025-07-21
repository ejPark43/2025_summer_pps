package week3.pps_2025_07_21;

import java.util.Scanner;
//A185 두 수 비교하기
public class A185_ParkEunJu_20250721 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int A = s.nextInt();
        int B = s.nextInt();
        if(A>B) System.out.println(">");
        else if(A<B) System.out.println("<");
        else System.out.println("==");


    }
}

