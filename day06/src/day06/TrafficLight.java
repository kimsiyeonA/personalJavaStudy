package day06;

import java.util.Scanner;

public class TrafficLight {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc = new Scanner(System.in);
//		System.out.println("======신호등 프로그램======");
//		System.out.println("빨간불 : 1, 초록불 : 2");
//		System.out.println("신호입력 : ");
//		int sign = sc.nextInt();
//		System.out.println(sign==1?"빨간불":"초록불");

		Scanner sc = new Scanner(System.in);
		System.out.println("======신호등 프로그램======");
		System.out.println("신호를 입력하세요~");
		System.out.println("빨간불 : 1, 초록불 : 2");
		int sign = sc.nextInt();
		String result = sign==1?"정지하세요":"출발하세요";
		System.out.println(result); // 입력값이 3일때는 출발하세요가 나옴
	
		System.out.println("======신호등 프로그램======");
		System.out.println("신호를 입력하세요~");
		System.out.println("빨간불 : 1, 초록불 : 2, 노란불 : 3");
		int sign2 = sc.nextInt();
		String result2 = sign2==1?"정지하세요":(sign2==2?"출발하세요":"서행하세요");
		System.out.println(result2); // 입력값이 3일때는 출발하세요가 나옴	
	}
}
