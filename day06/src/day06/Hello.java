package day06;

public class Hello {
	public static void main(String[] args) {
		String str = "Hello";
		int i = 3;
		float f = 3.14f;
		double d = 3.14;
		char c = 'a';
		
		
		System.out.println(str instanceof String);
		// str 이 스트링 클래스로 만들어 진건가요?
		

		System.out.println(Integer.valueOf(i)instanceof Integer);
		//System.out.println(i instanceof Integer);
		//int는 원시자료형이기 때문에 자료형을 의미하는 클래스를 쓰고/ i는 객체 타입이 아니기 때문에 valueof를 사용하여 객체 타입으로 만들면
		//저 클래스를 사용해서 실행하는 것
		
		System.out.println(Float.valueOf(f)instanceof Float);
		// 이게 Float 객체를 가지고 만들어진 아이인가요?
		
		System.out.println(Double.valueOf(d)instanceof Double);
		// 이게 Double 객체를 가지고 만들어진 아이인가요?
		
		System.out.println(Character.valueOf(c)instanceof Character);
		// 이게 Character 객체를 가지고 만들어진 아이인가요?
		
		//>> 자료형을 확장해서 만든 클래스를 Wrapper 클래스라고 함
		// 변수를 해당 클래스의 값으로 만들어서 해당 값들이 해당 클래스로 만들어진건지 true로 확인할 수 있다.
	}
}
