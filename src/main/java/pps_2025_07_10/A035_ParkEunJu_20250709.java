package pps_2025_07_10;

import java.util.Scanner;

// A035 화성 수학: 문제에 화성 수학식에 대한 설명이 주어진다. 화성 수학식이 입력으로 주어지면 그 계산 값을 출력하는 문제
public class A035_ParkEunJu_20250709 {
    public static void main(String args[]) {
        //A035 화성수학
        Scanner s = new Scanner(System.in);
        int t =  Integer.parseInt(s.nextLine()); // test case 개수. nextLine으로 받음

        double[] ans = new double[t]; //정답 넣어둘 출력용 배열
        double num =0; //정답으로 쓸 변수


        for(int i =0; i < t; i++){
            String line = s.nextLine(); // 한줄을 그대로 받아옴
            String[] str = line.split(" "); // 공백 기준으로 나누고 배열에 넣어줌

            for(int j = 0; j<str.length; j++){
                if(j==0) num = Double.parseDouble(str[0]); // 각 줄의 첫번째는 숫자임. 숫자를 num에 넣어준다
                else
                    switch(str[j]){// 각 케이스마다 num에 적절한 연산으로 바꿔줌
                        case "@" : num*=3;
                            break;
                        case "%": num+=5;
                            break;
                        case "#": num-=7;
                            break;
                    }

            }
            ans[i]=num;

        }

        for(int i = 0; i<t; i++) System.out.printf("%.2f\n", ans[i]); // .2f로 소수점 둘째자리까지 출력

    }

}
