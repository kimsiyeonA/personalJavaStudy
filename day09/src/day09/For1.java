package day09;

public class For1 {
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.println(i);//반복하고 싶은 명령
			// 변수를 만들어서i에 1이 들어감
			// 변수 i의 값을 넣어서 조건식(i<=10)이 맞는지 검증햠
			// 참이라면 반복하고 싶은 명령을 실행함
			// i++ > i 를 1증가함 즉 2가됨
			// 초기식이 아닌 조건식으로 돌아가 검증하고 검증이 참일 때까지 실행되면서 증가식또한 실행됨
			// 실행하다가 조건식이 거짓이 되면 for문이 멈춤
		}
		// for문 초기식에서 만든 i변수의 값을 출력
	}
}
