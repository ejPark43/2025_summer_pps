package pps_2025_07_09;

import java.util.Scanner;
import java.math.BigInteger;
// A028 큰 수 A+B: 크기가 큰 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 문제
public class A028_ParkEunJu_20250709 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        BigInteger A = s.nextBigInteger();
        BigInteger B = s.nextBigInteger();
        System.out.println(A.add(B));



    }


}
