package day07;

public class If_else {
	public static void main(String[] args) {
		int age=15;
		if(age>19) {
			System.out.println("성인입니다.");
			System.out.println("성인요금이 적용됩니다.");
		}// 위에 있는 조건이 거짓일 때 실행할 명령은 else 를 사용
		else {//age<=19
			System.out.println("청소년입니다.");
			System.out.println("청소년요금이 적용됩니다.");
		}
		System.out.println("결재를 진행해 주세요");
	}
}
