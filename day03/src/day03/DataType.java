package day03;

public class DataType {
	public static void main(String[] args) {
		int a = 65;
		// int a의 변수에 65라는 정수를 저장한다.
		float f=a;
		// 정수를 실수에 넣는 것은 원칙적으로는 안되지만 자동으로 해줌
		System.out.println(f); // > 실수값이 들어감
		// 내가 아무런 처리지 않았지만 자동으로 정수값을 실수값으로 변환해서 저장하는 것 : 자동형변환이라고 함
		
		// char c = a; // 오류 :a는 정수형인데 어떻게 문자형으로 바꿔?
		char c = (char)a;
		System.out.println(c); 
		// 65에 해당하는 아스키코드
		// a가 강제적으로 65로 변환이 됨 : 강제형변환(명시적 형변환)
		// 강제형번환 할 때는 변환할 값 앞에, 변환한하고 싶어하는 자료형을 ()에 넣고 출력하면 됨	
	}
}
