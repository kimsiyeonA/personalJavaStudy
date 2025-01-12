package day13;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class LottoEx {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		int[] randomLotto = new int[6];
		int randomBounce = random.nextInt(45)+1;
		
		for(int i = 0; i<randomLotto.length;i++) {
			randomLotto[i] = random.nextInt(45)+1;
		}
		
		int[] userLotto = new int[6];
		int userBounce;
		
		int count = 0;
		
		System.out.println("로또 번호를 입력하세요");
		for(int i = 0; i<userLotto.length; i++) {
			System.out.print(i+1+"번째 번호 : ");
			userLotto[i] = sc. nextInt();
		}
		System.out.print("보너스 번호를 입력하세요 : ");
		userBounce = sc. nextInt();
		
		for(int i =0; i<6; i++) {
			for(int j =0; j<6; j++) {
				if(randomLotto[i]==userLotto[j]) {
					count++;
				}
			}
		}
		
		if(count==6) {
			System.out.println("1등");
		}else if(count==5&&randomBounce==userBounce) {
			System.out.println("2등");
		}else if(count==5) {
			System.out.println("3등");
		}else if(count==4) {
			System.out.println("4등");
		}else if(count==3) {
			System.out.println("5등");
		}else {
			System.out.println("다음 기회에");
		}
		
		System.out.println(Arrays.toString(randomLotto));
		System.out.println(Arrays.toString(userLotto));
	}
}
