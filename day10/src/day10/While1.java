package day10;

import java.util.Scanner;

public class While1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "y"; // while 문이 실행되도록 초기값을 조건이 참일 값을 넣어준다.
		int count = 0;
		while(answer.equals("y")) { // y가 아니라면 반복문 자체가 실행되지 않음
			System.out.println("음악을 재생하시겠습니까?(y)");
			answer = sc.nextLine();
			if(answer.equals("y")) {
				//System.out.printf("음악을 %d번 재생했습니다.\n",++count);
				count++;
				System.out.println("음악이 "+count+"번 재생되었습니다.");
			}
		}
		System.out.println("재생 종료");
		// 대소문자 구분하여 대문자 Y를 입력하면 반복문이 멈춤 
		// answer 조건이 없으면 y와 일치하지 않기 때문에 오류가 난다.
	}
}
