package day08;

import java.util.Random;

public class Pokemon {
	public static void main(String[] args) {
		Random random = new Random();
		System.out.println("☆★☆★Random Choosing Pokemon☆★☆★");
		System.out.println("1. 피카츄 : 전기괴물");
		System.out.println("2. 꼬부기 : 물괴물");
		System.out.println("3. 이상해씨 : 풀괴물");
		int mypokemon = random.nextInt(3)+1; // (3)=>0-2 / +1 범위를 하나 증가시키기 위해서
		System.out.println("선택된 번호 :"+mypokemon);
		//case의 값은 중복이 안됨
		// 조건의 변수가 정수이면 값의 자료형도 정수이여함
		switch(mypokemon) {
		case 1 :
			System.out.println("피카츄 선택! 백만볼트!!!");
			break;
		case 2 :
			System.out.println("꼬부기 선택! 물대포!!!");
			break;
		case 3 :
			System.out.println("이상해씨 선택! 덩쿨채찍!!!");
			break;
		//default가 필요없음 1-3을 출력할거기 때문에
		}
	}
}
