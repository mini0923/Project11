package wrapper.quiz;

import java.util.Scanner;

public class Quiz4 {

	public static void main(String[] args) {

		// 내 방식
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 숫자를 입력하세요 : ");
		String str1 = scanner.nextLine();
		int num1 = Integer.parseInt(str1);
		
		System.out.println("두번째 숫자를 입력하세요 : ");
		String str2 = scanner.nextLine();
		int num2 = Integer.parseInt(str2);

		System.out.println("두 수의 합은 : " + (num1 + num2));

		scanner.close();
		
		
		
		// 선생님 방식
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("첫번째 숫자를 입력하세요 : ");
//		String num1 = sc.nextLine();
//		
//		System.out.println("두번째 숫자를 입력하세요 : ");
//		String num2 = sc.nextLine();
//	
//		int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
//		
//		System.out.println("두 수의 합은 : " + sum);
//		
//		sc.close();
	}

}
