package day05;

public class XorPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 15; // 1111(2) = 15
		int b = 5; // 0101(2) = 5
		
		
		// 비트 논리 연https://chatgpt.com/c/675a97b4-41f4-8006-b2e4-53cd32d0ce46산자
		System.out.println(a&b); // 0101(2) = 5
		System.out.println(a|b); // 1111(2) = 15
		System.out.println(a^b); // 1010(2) = 10
		System.out.println(~b); // 1010(2) = 10x -> -6
		
		
		// 비트 쉬프트 연산자
		System.out.println(a>>2);
		System.out.println(b<<4);
		
	}

}
