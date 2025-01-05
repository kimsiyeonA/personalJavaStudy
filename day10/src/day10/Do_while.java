package day10;

public class Do_while {
	public static void main(String[] args) {
		int i = 100;
		do {
			System.out.println("적어도 한번은 출력되는 문장");
		}while(i<10); // 세미콜론 있는거 잊지 말기 > 참이 아니라서 반복이 안됨
		System.out.println("종료");
		while(i<10) { // 조건식이 거짓이기 때문에 실행되지 않음
			System.out.println("적어도 한번은 출력되는 문장");
		}
		System.out.println("종료");
	}
}
