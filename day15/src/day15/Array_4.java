package day15;

import java.util.Arrays;

public class Array_4 {
	public static void main(String[] args) {
		int a [] = {1,2,3,4,5,6};
		int b [] = {0,0,0,0,0,0,0};
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		System.arraycopy(a, 2, b, 3, 4);		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
		System.arraycopy(a, 0, b, 3, 5);
		System.out.println(Arrays.toString(b)); // 받는 배열의 길이를 넘어가는 복사는 되지 않음
	}
}
