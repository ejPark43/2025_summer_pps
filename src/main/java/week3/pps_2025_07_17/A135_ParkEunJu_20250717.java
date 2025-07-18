package week3.pps_2025_07_17;

import java.util.*;

//A135 베스트셀러  : 제일 많이 입력받은 책의 제목을 출력하는 문제
public class A135_ParkEunJu_20250717 {

    public static void main(String args[]) {
        Scanner s = new Scanner (System.in);

        int n = Integer.parseInt(s.nextLine()); //test case

        Map<String, Integer> map = new HashMap<>(); // hash map 사용 , key값은 string으로 하고 value는 Int값으로 사용
        int max = 0;
        for (int i = 0; i < n; i++) {
            String book = s.nextLine();
            map.put(book, map.getOrDefault(book, 0) + 1); // getOrDefault는 찾는 키가 맵에 있으면 키값 반환하고 없으면 기본값을 반환함
            max = Math.max(max, map.get(book));
        }
        // 맵에는 이제 책 제목마다 카운트가 존재하는 상태임. 카운트의 최댓값을 구하고 리스트에 넣는다.

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == max) list.add(entry.getKey());
        }
        Collections.sort(list); // 최대값이 여러개인 경우엔 알파벳 순서이므로 sorting 해줌
        System.out.print(list.get(0));

    }
}

