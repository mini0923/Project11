package object;

public class Ex5 {

	public static void main(String[] args) {

		String str1 = new String("test");
		System.out.println(str1.toString()); // 주소 대신 문자열 값 출력
		System.out.println(str1);	// 참조변수를 출력 시 자동으로 toString() 메소드 출력
		
		String str2 = new String("test");
		if(str1.equals(str2)) { // 주소 대신 문자열의 내용을 비교
			System.out.println("str1 과 str2 는 같은 문자열입니다.");
		}
		
		
		
		
	}

}
