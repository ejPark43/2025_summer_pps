package week3.pps_2025_07_21;

import java.util.Scanner;

//A180 나머지
public class A180_ParkEunJu_20250721 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int A = Integer.parseInt(s.next());
        int B = Integer.parseInt(s.next());
        int C = Integer.parseInt(s.next());

        System.out.println((A+B)%C);
        System.out.println(((A%C) + (B%C))%C);
        System.out.println((A*B)%C);
        System.out.println( ((A%C)* (B%C))%C);

    }
}

