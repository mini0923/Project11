package string;

import java.util.Scanner;

public class Quiz5 {

	public static void main(String[] args) {

		Scanner scanner = new  Scanner(System.in);
		
		System.out.println("문자를 입력해주세요 : ");
		
		String str = scanner.nextLine();
				
		StringBuilder build = new StringBuilder(str);
		
		build.reverse();
		
		System.out.println("입력하신 문자를 거꾸로하면 : " + build);
		
	}

}
