package day04;

public class Operator {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10 ; //a 변수에 10 값을 저장
		int b = 3;//b 변수에 3 값을 저장
		double doubleB = 3; // 자동형변환
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		
		System.out.println(a/b); 
		// 정수 나누기 정수는 정수만 나옴
		System.out.println(a/doubleB);
		// 정수 나누기 실수는 실수가 나옴
		
		System.out.println(a%b); // 정수
		System.out.println(a%doubleB); // 실수
		System.out.println(doubleB%a); // 실수
	}
}
