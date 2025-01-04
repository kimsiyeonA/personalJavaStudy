package day09;

public class For0 {
	public static void main(String[] args) {
		//ctrl + alt + 아래 화살표 : 라인 복사
//		System.out.println("1번 컴퓨터 켜줘");
//		System.out.println("2번 컴퓨터 켜줘");
//		System.out.println("3번 컴퓨터 켜줘");
//		System.out.println("4번 컴퓨터 켜줘");
//		System.out.println("5번 컴퓨터 켜줘");
//		System.out.println("6번 컴퓨터 켜줘");
//		System.out.println("7번 컴퓨터 켜줘");
//		System.out.println("8번 컴퓨터 켜줘");
//		System.out.println("9번 컴퓨터 켜줘");
//		System.out.println("10번 컴퓨터 켜줘");

		for(int i=1; i<=10;i++) {
			System.out.println(i+"번 컴퓨터 켜줘");
		}
		// i의 의미 : 인덱스의 약자 i의 위치가 각각의 위치를 나타내는것 같아서 일반적으로 i를 많이 사용함
		for(int i=10; i>=1;i--) {
			System.out.println(i+"번 컴퓨터 켜줘");
		}
		for(int i=1; i<=10;i++) {
			if(i%2==0) { // i == 짝수
				System.out.println(i+"번 컴퓨터 켜줘");
			}
		}
		for(int i=1; i<=10;i+=2) { //i=i+2
			System.out.println(i+"번 컴퓨터 켜줘");
		}
		for(int i=1; i<=10;i++) {
			if(i%2==1) { // i == 홀수
				System.out.println(i+"번 컴퓨터 켜줘");
			}
		}
	}
}
