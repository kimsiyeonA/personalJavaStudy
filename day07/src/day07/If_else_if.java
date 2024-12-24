package day07;

import java.util.Scanner;

public class If_else_if {
	public static void main(String[] args) { // ctrl+shift+0 : 자동 import
		Scanner sc = new Scanner(System.in); // 해당 키보드로 입력 받아라
		int age;
		System.out.print("나이 : ");
		age=sc.nextInt();
		
		if(age>19) { 
			System.out.println("성인입니다");
			System.out.println("성인 요금이 적용됩니다.");
		}
		else if(age>13) {// 13<age<19
			//age 가 23일때 위에 있는 조건이 거짓이어야 하는데 참이여서 실행되지 않음
			System.out.println("청소년 입니다.");
			System.out.println("청소년 요금이 적용됩니다.");
		}
		else if(age>8) {// 8<age<13 > age<13 조건을 부정함
			System.out.println("어린이 입니다");
			System.out.println("어린이 요금이 적용됩니다");
		}
		else{//age<=8
			System.out.println("유아 입니다");
			System.out.println("유아 요금이 적용됩니다");
		}
		System.out.println("결재를 진행해주세요");
		
	}
}
