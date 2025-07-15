package week3.pps_2025_07_15;

import java.util.*;

//A128 균형잡힌 세상 :괄호 등 여러 조건에 따라 문자열이 균형을 이루는지 판단하는 문제
public class A128_ParkEunJu_20250715 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        while(true) { // while 반복으로 .이 있을때까지 반복해서 문자열 입력받음.
            String str = s.nextLine(); // 계속 입력받는 문자열
            if(str.equals(".")) break;//온점 있으면 break

            System.out.println(match(str));
        }
    }
    public static String match(String str) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<str.length(); i++) {
            char c = str.charAt(i);

            if(c=='(' || c=='[') {
                stack.push(c); // ( 나 [ 라면 스택에 쌓음
            }
            else if(c==')') { // 만약 들어온 char이 )일때,
                // stack이 비어있으면 매칭 안되니까 no리턴, peek()해서 꺼낼 원소가 (가 아니라면 )와 매칭이 안 되므로 no 리턴
                if(stack.empty() || stack.peek()!='(') return "no";
                else stack.pop(); // ')'가 들어온 상황에서 만약 stack에서 pop할 위치에 있던 게 '('라면 문제없이 match된거라 pop해서 없애줌

            }
            else if(c==']') { //들어온게 ]일때
                // stack 비어있으면 no리턴, peek()해서 본 제일 최근 원소와 매칭 안되면 no
                if(stack.empty() || stack.peek()!='[') return "no";
                else stack.pop(); // matching 됨, pop 한다 .
            }

        }
        if(stack.empty()) return "yes";

        else return "no";
    }
}
