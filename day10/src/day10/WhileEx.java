package day10;

public class WhileEx {
	public static void main(String[] args) {
//		System.out.println("x:1");
//		System.out.println("x:2");
//		System.out.println("x:3");
//		System.out.println("x:4");
//		System.out.println("x:5");
//		System.out.println("x:6");
//		System.out.println("x:7");
//		System.out.println("x:8");
//		System.out.println("x:9");
//		System.out.println("x:10");
		
		int x=1;
		System.out.println("x:"+x);
		x++;
		System.out.println("x:"+x);
		x++;
		System.out.println("x:"+x);
		x++;
		System.out.println("x:"+x);
		x++;
		System.out.println("x:"+x);
		x++;
		System.out.println("x:"+x);
		x++;
		System.out.println("x:"+x);
		x++;
		System.out.println("x:"+x);
		x++;
		System.out.println("x:"+x);
		x++;
		System.out.println("x:"+x);
		x++;
		// x의 값을 출력하는 것과 x가 1씩 증가하는 것이 반복되고 있음
		
		x=1; 
		while(x<=10) { // 1-10까지 반복 > 10이 될때까지 출력
			System.out.println("x:"+x); // x값 출력
			x++;// x값 +1 더하기 > 11이 되어 거짓이 되면 반복문 밖을 빠져나가  그 다음 코드를 실행시킨다.
		}
	//  변수의 값을 가지고 범위 설정 > 변화량을 주면서 코드를 반복함
	}
}
