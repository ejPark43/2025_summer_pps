package week3.pps_2025_07_17;

import java.util.*;

//A131 통계학 : 주어진 정수들의 산술평균, 중앙값, 최빈값, 범위를 구하는 문제
public class A131_ParkEunJu_20250717 {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = Integer.parseInt(s.nextLine()); // 들어올 숫자 개수
        int[] nums = new int[n]; // 들어올 숫자들 넣을 배열
        int[] ans = new int[4]; // 정답 넣을 배열
        int sum=0;
        for (int i =0; i<n; i++) {
            nums[i] = Integer.parseInt(s.nextLine());
            sum+=nums[i]; // 들어온 값 바로 더함
        }
        Arrays.sort(nums); // 들어온 값들 배열 정렬함 (=> 중앙값, 범위 알기위해서 )

        //
        boolean flag = false;	 // 최빈값 찾는 부분
        int mode_max = 0;
        int mode = 100000;

        for(int i=0; i<n; i++) {
            int jump=0;
            int count = 1;
            int iValue = nums[i];
            for(int j = i+1; j<n; j++) {
                if(iValue!=nums[j]) {
                    break;
                }
                count++;
                jump++;
            }
            if(count>mode_max) {
                mode_max = count;
                mode = iValue;
                flag= true;
            }else if(count == mode_max&&flag==true) {
                mode= iValue;
                flag = false;
            }
            i+=jump;
        }
        //



        ans[0]=(int)Math.round((double)sum/n); // 산술평균, (모두 더한값 / n)한 값에 반올림
        ans[1]=nums[nums.length/2]; // 중앙값
        ans[2]=mode; // 최빈값
        ans[3]=nums[nums.length-1] - nums[0]; // 범위. 최대 - 최소라서 오름차순 정렬된 값인 (맨끝원소 -  첫 원소)

        for(int i=0; i<4; i++) {
            System.out.println(ans[i]);
        }
    }
}

