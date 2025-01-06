package day11;

import java.util.Scanner;

// 무한반복하면서 누적합산하다가 0이 입력되면 합산을 멈춤
public class BreakEx2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i,sum =0;
		while(true) {
			System.out.println("더할 숫자를 입력해주세요:(종료 0)");
			i = sc.nextInt();
			if(i==0) {
				break;
			}// 반복문이 중단되면 반복문이 빠져나가니 그외의 조건을 주지 않아도 멈춰서 빠져나가서 else if나 else를 안줘도 됨
			sum+=i;
			System.out.println("누적합 : "+sum);
		}
		System.out.println("현재까지의 총 누적합:"+sum);
	}
}
