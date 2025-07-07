package pps_2025_07_07;
import java.util.Scanner;

// A007 음계 판별 문제, 백준 2920번 - 20분
public class A007_ParkEunJu_20250707 {
public static void main(String[] args){
    Scanner s = new Scanner(System.in);
boolean isAsc = true;
boolean isDesc = true;


int prev = s.nextInt();
    for (int i=0; i<7; i++){

        int n = s.nextInt();
        if(prev < n ) isDesc = false;
        else if(prev>n  ) isAsc = false;
        prev = n;

    }

if(isAsc) System.out.println("ascending");
else if(isDesc) System.out.println("descending");
  else System.out.println("mixed");
}

}
