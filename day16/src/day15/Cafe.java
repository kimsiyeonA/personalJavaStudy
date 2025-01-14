package day15;

import java.util.Scanner;

public class Cafe {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0; // 총 개수
		String orderList [] = new String[5];
		// 주문한 메뉴를 저장할 문자열 배열, 배열은 고정 크기를 가져서 최대인게 몇개 인지 지정해주어야 함
		// 주문은 총 5개까지 가능
		int total = 0;// 총 금액 저장
		
		while(true) {
			System.out.println("☆★☆★Cafe☆★☆★");
			System.out.println("1. 주문하기");
			System.out.println("2. 취소하기");
			System.out.println("3. 결제하기");
			System.out.println("4. 끝내기");
			System.out.print("입력 : ");
			int num = sc. nextInt();
			if(num==1) {
				String menuName="";
				int menuPrice=0;
				System.out.println("☆★☆★menu☆★☆★");
				System.out.println("1. 아메리카노\t 3800원");
				System.out.println("2. 에스프레소\t 2400원");
				System.out.println("3. 카페라떼\t 4200원");
				System.out.println("4. 밀크티\t\t 5100원");
				System.out.print("주문할 메뉴 번호 : ");
				int menuNum = sc. nextInt();
				if(menuNum==1) {
					menuName="아메리카노";
					menuPrice=3800;
				}
				else if(menuNum==2) {
					menuName="에스프레스";
					menuPrice=2400;
				}
				else if(menuNum==3) {
					menuName="카페라떼";
					menuPrice=4200;
				}
				else if(menuNum==4) {
					menuName="밀크티";
					menuPrice=5100;
				}
				else{
					System.out.println("잘못 입력하셨습니다.");
					continue;//반복의 처음으로 돌아가라
				}
				total+=menuPrice; // 총 가격 누적
				orderList[count] = menuName; 
				// 메뉴 이름 저장, count로 하면 저장하면서 그다음 위치로 이동할 수 있다.
				count++;//주문 수
				System.out.println("주문한 메뉴는 "+menuName+" 입니다.");
				System.out.println("가격은 "+menuPrice+"입니다.");
				
			}else if(num==2){
				System.out.println("---주문한 메뉴 리스트---");
				for(int i=0; i<count;i++) { // 주문된 수 만큼 반복됨
					System.out.println((i+1)+". "+orderList[i]);
				}
				System.out.print("취소할 메뉴번호: ");
				int cancelNum = sc.nextInt();
				if(1<=cancelNum&&cancelNum<=count) {
					String delMenu = orderList[cancelNum-1];
					System.out.println(delMenu+"메뉴 삭제!");
					for(int i=cancelNum-1;i<count;i++) {
						orderList[i] = orderList[i+1]; // 주문한 매뉴를 기준으로 당기기
					}
					if(delMenu.equals("아메리카노")) {total-=3800;}
					else if(delMenu.equals("에스프레소")) {total-=2400;}
					else if(delMenu.equals("카페라떼")) {total-=4200;}
					else if(delMenu.equals("밀크티")) {total-=5100;}
					else {System.out.println("잘못입력하셨습니다.");}
					count--;
				}
			}else if(num==3){
				
			}else if(num==4){
				System.out.println("반복종료");
				break;
			}else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
	}
}
