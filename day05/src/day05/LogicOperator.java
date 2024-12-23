package day05;

public class LogicOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 논리연산자 
		
		boolean a	= true;  // 논리형 a 변수에 true 값 저장
		boolean b	= false; // 논리형 b 변수에 false 값 저장
		boolean c	= true;  // 논리형 c 변수에 true 값 저장
		
		
		System.out.println(a&&b); // a 값과 b 값이 모두 참일 때만 결과가 참 : AND > false
		System.out.println(a&&c); // a 값과 c 값이 모두 참일 때만 결과가 참 : AND > true
		System.out.println((2<4)&&(4<5)); //true&&true = true
		// 항으로 조건들이 들어올 수 있다. 비교(관계)연산자가 논리연산자의 항으로 들어갈 수 있다.
		// 비교(관계)연산차는 참이나 거짓으로 결과가 나오기 때문에 가능하다
		
		
		System.out.println(a||b); // a 혹은 b 가 true 라면 결과가 true : OR > true
		System.out.println(a||c); // a 혹은 c 가 true 라면 결과가 true : OR > true
		System.out.println(b||b); // false||false == false : OR

		System.out.println(!a); // a 가 true 이면 false, false 면 true 
		
		
		
	}

}
