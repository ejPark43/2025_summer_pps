package week3.pps_2025_07_18;

import java.util.*;

//A139 뒤집기 : 0과 1로만 이루어진 문자열 S를 가지고 있다.
// 이 문자열 S에 있는 모든 숫자를 전부 같게 만들려고 한다. 할 수 있는 행동은 S에서 연속된 하나 이상의 숫자를 잡고 모두 뒤집는 것이다. 뒤집는 것은 1을 0으로, 0을 1로 바꾸는 것을 의미한다.
public class A139_ParkEunJu_20250718 {
// (0001001 -> 0000000 혹은 1111111 둘중 하나로 만드는데 더 최소인 경우수 구하기 )
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        StringTokenizer st1 = new StringTokenizer(str, "0");
        StringTokenizer st0 = new StringTokenizer(str, "1");

        System.out.println(Math.min(st1.countTokens(), st0.countTokens())); // 연속된 토큰이 몇개인지 세서 둘중에 어떤수가 더 작은지 == 최소 뒤집는 수


    }
}

