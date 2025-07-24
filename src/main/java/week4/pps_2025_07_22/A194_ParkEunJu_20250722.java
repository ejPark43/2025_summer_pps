
package week4.pps_2025_07_22;

import java.util.Scanner;
// A194 A+B - 8 : 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.

public class A194_ParkEunJu_20250722 {
    public static void main(String args[]) {

        Scanner s = new Scanner(System.in);
        int cases = s.nextInt();
        String[] answers= new String[cases];
        for(int i=0; i<cases; i++){
            int A = s.nextInt();
            int B = s.nextInt();
            answers[i] = A+" + "+B+" = "+(A+B);
        }
        for(int i=0; i<cases; i++){
            System.out.println("Case #"+(i+1)+": "+answers[i]);
        }

    }
}

