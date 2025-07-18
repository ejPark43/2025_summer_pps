package week3.pps_2025_07_17;

import java.util.*;

//A130 제로: 주어진 규칙(0이면 직전의 수를 지운다)에 따른 정수들의 합을 구하는 문제
public class A130_ParkEunJu_20250717 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int k = Integer.parseInt(s.nextLine()); // 들어올 값 개수

        int sum=0;
        Stack<Integer> stack = new Stack<>();

        for(int i=0; i<k; i++) {
            int curr = Integer.parseInt(s.nextLine());

            if(curr ==0) // 현재값이 0이면 직전값 pop
                stack.pop();
            else stack.push(curr);// 현재값이 0이 아니라면 Push

        }

        for(int o: stack) { // stack에 원소들 남아있을때
            sum+=o; //남아있는 것들을 모두 sum에 더함

        }
        System.out.println(sum);


    }
}

