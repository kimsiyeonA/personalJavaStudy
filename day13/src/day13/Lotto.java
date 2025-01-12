package day13;

import java.util.*; // 패키지 전체 사용, java.util 패키지에 있는 모든 클래스 import
//import java.util.Random; // 패키지가 동일함. 
//import java.util.Scanner;

public class Lotto {
	public static void main(String[] args) {
		// 필요한 라이브러리 준비
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		// 필요한 변수 생성
		int lottoAr[] = new int[6];
		int userAr[] = new int[6];
		
		int bonus, bonusUser; //같은 자료형이라면 이렇게 선언 가능함
		int count = 0; // 초기화 > 수를 합산해야하기 때문에
		
		// 알고리즘 대로 코드 구현하기
		// 1. 6개의 랜덤의 숫자와 보너스 점수를 로또 배열에 저장
		//lottorAr[0] = random.nextInt(45)+1; // 0-44 > 1-45
		for(int i = 0; i<lottoAr.length;i++) {
			lottoAr[i] = random.nextInt(45)+1;
		}
		bonus = random.nextInt(45)+1;
		
		System.out.println("Lotto:"+Arrays.toString(lottoAr)+"bonus:"+bonus);
		
		// 2. 사용자에게 1-45의 6개의 숫자를 입력받아 배열 저장하고 사용자에게 보너스 점수를 입력
		System.out.print("숫자 6개 입력 : ");
		for(int i =0; i<userAr.length;i++) {
			userAr[i] = sc.nextInt();
		}
		System.out.print("보너스 입력 : ");
		bonusUser = sc.nextInt();
		
		System.out.println("Lotto:"+Arrays.toString(lottoAr)+"bonus:"+bonus);
		
		// 3. 사용자가 입력한 값과 로또 배열에 있는 값을 비교하여 동일한 값의 개수를 count한다.
		// 로또 배열의 값과 사용자 배열의 값 중 같은 값이 몇개 있는지 카운팅 (순서 상관x)
//		for(int i=0; i < 6; i++) {
//			if(lottoAr[0]==userAr[i]) {
//				count++;
//			}
//		}
//		for(int i=0; i < 6; i++) {
//			if(lottoAr[1]==userAr[i]) {
//				count++;
//			}
//		}
		for(int j=0; j < 6; j++) {
			for(int i=0; i < 6; i++) {
				if(lottoAr[j]==userAr[i]) {
					count++;
				}
			}
		}
		
		System.out.println("맞춘 총 개수 : "+count);
		// 4. 몇 개의 숫자를 맞췄는지 다음과 같은 조건에 따라 등수를 출력한다.
		// count 갯수에 따라 등수 정하기
		if(count==6) {
			System.out.println("축하드립니다! 1등입니다!");
		}else if(count==5) {
			if(bonus==bonusUser) {
				System.out.println("축하드립니다! 2등입니다!");
			}else {
				System.out.println("축하드립니다! 3등입니다!");
			}
		}else if(count==4) {
			System.out.println("축하드립니다! 4등입니다!");
		}else if(count==3) {
			System.out.println("축하드립니다! 5등입니다!");
		}else{
			System.out.println("아쉽지만 다음기회에 ㅜㅜ");
		}
	}
}
