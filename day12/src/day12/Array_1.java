package day12;

public class Array_1 {
	public static void main(String[] args) {
		// 3명의 학생 점수를 저장하고 싶다.
//		int score1 =100;
//		int score2 =80;
//		int score3 =70;
//		
//		System.out.println("1번째 학생의 점수"+score1+"점");
//		System.out.println("2번째 학생의 점수"+score2+"점");
//		System.out.println("3번째 학생의 점수"+score3+"점");
//		30개를 하나씩 변수로 관리하기에는 어려움 > 한번에 묶어서 배열로 편하게 관리할 수 있다
		
		int[] scores = new int[3];
		
		scores[0]=100;
		scores[1]=80;
		scores[2]=70; // 배열의 이름을 가지고 인덱스로 해당 요소를 접근함
		System.out.println("1번째 학생의 점수"+scores[0]+"점"); // n -> n-1 반복됨
		System.out.println("2번째 학생의 점수"+scores[1]+"점");
		System.out.println("3번째 학생의 점수"+scores[2]+"점");
		
		// 반복되기 때문에 반복문으로 편하게 명령을 내릴 수 있음
		for(int i = 0; i <3; i++) {
			System.out.println(i+1+"번째 학생의 점수"+scores[i]+"점");
		}
		
		// 가능한 이유 : 변수의 이름은 반복해서 수정할 수 없음, 반복문 내에서는 그다음 변수 그다음 변수를 못함
		// 하지만 배열에서는 그다음 요소로 접근할 수있다, 인덱스를 때문에, 
		// 인덱스와 반복문를 사용해서 배열의 위치와 각각의 변수의 값을 가지고 올 수 있음
		
		// 즉, 배열을 사용하면 변수를 묶어서 번호로 접근하기 때문에 반복문으로 접근할 수있다.
		// 배열과 반복문은 같이 가져감
	}
}
