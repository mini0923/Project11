package string;

public class Quiz4 {

	public static void main(String[] args) {
		
		int result = getCharCount("자바 프로그래밍 입문");
		System.out.println("공백 제거 후 글자는 : "+ result);
		
		int result2 = getCharCount("equals 메소드는 두 객체가 같은지 비교한다");
		System.out.println("공백 제거 후 글자는 : "+ result2);

	}
	
	static int getCharCount(String str) {
		
		
		System.out.println("공백 제거 전 글자는 : " + str.length());
		
		int real;
		str = str.replace(" ","");
		real = str.length();
		
		return real;
	}
	

}
