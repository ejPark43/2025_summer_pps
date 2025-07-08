package pps_2025_07_08;

import java.util.Scanner;
// A015 검증수
public class A015_ParkEunJu_20250708 {
    public static void main (String[] args){
    Scanner s = new Scanner(System.in);
    int sum=0;
    for(int i=0; i<5; i++)
    {

        sum += (int)Math.pow(s.nextInt(),2);
    }
    sum%=10;
    System.out.println(sum);
    }
}
