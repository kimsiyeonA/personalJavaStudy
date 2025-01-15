package day12;

public class InitAr {
	public static void main(String[] args) {
		int arInt[]= new int [3] ;
		double arDouble[]= new double [3] ;
		char arChar[]= new char [3] ;
		String arString[]= new String [3] ;
		
		for(int i=0; i<3; i++) {
			System.out.print(arInt[i]+" "); // 값을 넣지 않더라도 기본적으로 정수형의 초기값이 출력됨
		}
		System.out.println();
		for(int i=0; i<3; i++) {
			System.out.print(arDouble[i]+" "); // 값을 넣지 않더라도 기본적으로 실수의 초기값이 출력됨
		}
		System.out.println();
		for(int i=0; i<3; i++) {
			System.out.print(arChar[i]+" "); // 값을 넣지 않더라도 기본적으로 문자형의 초기값이 출력됨 > 빈칸이여서 안보임
		}
		System.out.println();
		for(int i=0; i<3; i++) {
			System.out.print(arString[i]+" "); // 값을 넣지 않더라도 기본적으로 문자열의 초기값이 출력됨
		}
	}
}
