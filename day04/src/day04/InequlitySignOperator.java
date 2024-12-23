package day04;

public class InequlitySignOperator {
	public static void main(String[] args) {
		//대소비교연산자 : 앞과 뒤의 대소를 비교함
		int a = 10;//a변수에 10 저장
		int b = 20;//b변수에 20 저장
		int c = 30;//c변수에 30 저장
		
		System.out.println(a<b);
		//a가 b보다 작아? > 앞의 문자를 주어로 두고 읽어야함
		System.out.println(a>b);
		//a가 b보다 커?
		System.out.println(a+b<=c);
		//a+b가 c보다 작거나 같아? > 같다에 참이 나옴 | 산술>관
		System.out.println(a+b>=c);
		//a+b가 c보다 크거나 같아? > 같다에 참이 나옴
		
		//-----------------
		System.out.println();
		
		//등가비교연산자 : 앞과 뒤가 같은지 비교함
		double aa= 3.14; // 실수형 변수 aa에 3.14 저장
		double bb= 5.14; // 실수형 변수 bb에 5.14 저장
		System.out.println(aa==bb); // aa와 bb가 같은가?
		System.out.println(aa!=bb); // aa와 bb가 같지 않는가?
		
		String c1="Hello JAVA!"; // c1 문자열 변수에 "Hello JAVA!"값
		System.out.println(c1 == "Hello JAVA!");//true
		System.out.println(c1.equals("Hello JAVA!"));//true
		// 문자열을 비교할 때는 c1에 있는/ 문자열의 클레스에 있는 매서드 .equals 를 사용한다.
		System.out.println(c1.equals("hello java!"));//false
	}
}
