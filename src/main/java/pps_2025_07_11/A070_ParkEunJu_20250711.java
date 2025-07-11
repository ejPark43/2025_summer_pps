package pps_2025_07_11;

import java.util.*;

// A070 카드2 : N장의 카드에는 차례로 1부터 N까지의 번호가 있다. N이 주어졌을 때, 제일 위에 있는 카드를 바닥에 버린 후, 제일 위에 있는 카드를 제일 아래에 있는 카드 밑으로 옮기는 동작을 반복한다. 이 동작을 반복했을 때, 제일 마지막에 남게 되는 카드를 구하는 프로그램이다.

public class A070_ParkEunJu_20250711 {

    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        Queue<Integer> q = new LinkedList<>(); // 큐 생성
        int n = s.nextInt();

        for(int i=1; i<=n; i++)
            q.offer(i); // 1부터 n까지 값을 큐에 넣어줌. 맨 위가 1


        while(q.size()>1){ // 큐에 들어있는 원소가 1개면 그만
            q.poll(); // 맨 위 카드 버림
            q.offer(q.poll()); // 위에서 버리고 난 다음 맨 위의 걸 아래로 넣음

        }
        System.out.println(q.poll()); // 남은 것 출력
    }
}
