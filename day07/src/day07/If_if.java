package day07;

import java.util.Scanner;

public class If_if {
	public static void main(String[] args) {
		String id,password;
		Scanner input = new Scanner(System.in);
		System.out.print("아이디를 입력해주세요 : ");
		id = input.nextLine();//띄어쓰기 까지 입력받기
		
		if(id.equals("java")) {
			System.out.println("id 일치!");
			System.out.print("비밀번호를 입력해주세요 : ");
			password=input.nextLine();
			if(password.equals("123")) {
				System.out.println("password 일치!");
				System.out.println("로그인 성공!");
			}
			else { 
				// password 조건을 부정함. password 가 123과 일치하지 않을 때
				System.out.println("password 불일치!");
			}
		}
		else { 
			// id 조건을 부정함. id 가 java 와 일치하지 않을 때
			System.out.println("id 불일치!");
		}
	}
}
