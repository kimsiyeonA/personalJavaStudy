package day09;

public class For2 {
	public static void main(String[] args) {
		int sum=0;
		for(int i=1; i<=10; i++) {
			System.out.printf("i=%d, sum=%d\n",i,sum+=i);
			// 증가되면서 1~10까지의 값이 누적되면서 1~10까지의 합열 계산하게 됨
		}
		System.out.println(sum);
		//1~10까지의 합을 계산해서 출력
		//sum = 1+2+3...+10; > 숫자를 더한다는 작업이 반복이 됨
		sum = 0; // > 동일한 구조를 만들기 위함
		sum = sum+1; //1
		sum = sum+2; //3
		sum = sum+3; //6
		sum = sum+4; //10
		//..
		sum = sum+10;
		
//		sum = sum+숫자; //1
//		sum = sum+숫자; //3
//		sum = sum+3; //6
//		sum = sum+4; //10
//		//..
//		sum = sum+10;
		// 숫자가 반복되니 숫자를 반복하여 반복된 값을 sum에 누적시키는 것
		// 숫자가 1씩 증가되면서 더해지는 반복을 명령으로 만들어주는 것
		
		
	}
}
