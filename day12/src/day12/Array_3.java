package day12;

import java.util.Arrays;

public class Array_3 {
	public static void main(String[] args) {
		int []students= {100,95,90,88,93};
		int sum =0;
		for(int i=0; i<students.length; i++) {
			sum+=students[i];
		}
		System.out.println(sum/(double)students.length); 
		// 정수/정수 > 정수 / 실수 나오려면 정수/실수 (한쪽을 실수로 강제형변환)
	}
}
