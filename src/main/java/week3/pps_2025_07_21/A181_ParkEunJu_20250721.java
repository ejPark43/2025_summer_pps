package week3.pps_2025_07_21;

import java.util.Scanner;

// A181 곱셈 (두개의 세자리 수 곱해서 그 과정 출력)
public class A181_ParkEunJu_20250721 {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int a = Integer.parseInt(s.nextLine());
        int b = Integer.parseInt(s.nextLine());

        int[] nums = new int[4];

        for(int i =0; i<3; i++) {
            nums[i] = a * (b%10);
            nums[3]+=nums[i]*(Math.pow(10, i));
            b/=10;

        }

        for(int i =0; i<4; i++) {
            System.out.println(nums[i]);
        }

    }
}

