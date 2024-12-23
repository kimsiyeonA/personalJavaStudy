package day04;

public class SingOperator {
	public static void main(String[] args) {
		int a = -1; // 정수는 음수도 포함함
		int b = 2;
		System.out.println(a);
		System.out.println(-b);
		
		//-----------------
		boolean aa = true; // aa 변수에 true 값 저장
		boolean bb = false; // bb 변수에 false 값 저장
		boolean cc = !bb; // cc 변수에 bb가 true라면 false, false라면 true
		System.out.println(aa);
		System.out.println(!aa);
		System.out.println(bb);
		System.out.println(cc);
		
		//-----------------
		int aaa = 1; // aaa 변수에 1값 저장
		System.out.println(aaa);
		
		aaa++; // aaa값 1증가 : 후위형
		System.out.println(aaa); // 이때, aaa는 2
		System.out.println(++aaa); 
		// 출력명령어, 증가 두개의 명령어가 있고 어떤게 우선순위인지가 더 중요
		// aaa의 값 1증가, 전위형 : 증가가 먼저 출력 aaa: 3 > 우선순위 증가
		System.out.println(aaa++); 
		// aaa의 값 1증가, 후위형 : 증가가 나중에 출력 aaa: 3 > 우선순의 출력
		System.out.println(aaa);
		// 이전 라인에서 aaa값이 증가되었으므로 출력 aaa : 4
	}
}
