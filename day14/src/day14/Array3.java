package day14;

import java.util.Scanner;

public class Array3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int scores[][] = new int[4][3];
		String subject[] = {"국어","영어","수학"}; 
		// 문자열 값은 명령이 반복되었을 때 반복문 안에서 문자열값이 변한다를 할 수 없어서, 
		// 숫자값처럼 쓸려면 문자열 배열을 써서 인덱스로 변하는 요소를 만들어 줄수 있다.
		
//		System.out.println("1번 학생 점수---");
//		System.out.println(subject[0]+": ");
//		scores[0][0] = sc.nextInt();
//		System.out.println(subject[1]+": ");
//		scores[0][1] = sc.nextInt();		
//		System.out.println(subject[2]+": ");
//		scores[0][2] = sc.nextInt();
		
//		System.out.println("1번 학생 점수---");
//		System.out.println("국어: ");
//		scores[0][0] = sc.nextInt();
//		System.out.println("영어: ");
//		scores[0][1] = sc.nextInt();		
//		System.out.println("수학: ");
//		scores[0][2] = sc.nextInt();
		
		// 2차원 배열 활용해서 사용자에게 입력받은 값을 저장하는 방법
		for(int j = 0; j < 4; j++) {
			System.out.println((j+1)+"번 학생 점수---");
			for(int i=0; i<3;i++) {
				System.out.print(subject[i]+": ");
				scores[j][i] = sc.nextInt();	
			}
		}
		
		//2차원 배열에서 저장된 값을 출력
		for(int i=0; i<3; i++) {
			System.out.print("\t"+subject[i]); // \t > tab키처럼 길게 띄어줌
		}
		for(int j = 0; j < 4; j++) {
			System.out.println("");
			System.out.print((j+1)+"번"+"\t");
			for(int i=0; i<3;i++) {
				System.out.print(scores[j][i]+"\t");
			}

		}
		
		
	}
}
