package string;

import java.util.Scanner;

public class Quiz6 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
				
		

		while (true) {
			
			System.out.println("문장을 입력하세요 : "); 
			
			String str = scanner.nextLine(); // 문자열 입력받기

			String line = str; // 입력받은 str의 값을 line에 넣기
			
			// 문자열이 end or END라면 무한루프 끝
			if (line.equals("END") || line.equals("end")) {
				System.out.println("무한루프가 끝났습니다.");
				break;
			}
			
		}
	
		
		
		
	}

}
