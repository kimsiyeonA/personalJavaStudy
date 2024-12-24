package day07;

public class If_sentence {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		if(a > 3) {
			System.out.println("a는 3보다 큽니다");
			// 조건식이 참이여서 {}에 있는 내용이 실행한다.
		}
		a = 2;
		if(a > 3) {
			System.out.println("a는 3보다 큽니다");
			// 조건식이 거짓이여서 {}에 있는 내용이 실행되지 않는다.
		}
		System.out.println("검사가 끝났습니다."); // if문에 상관 없이 실행되는 명령문
	}
}
