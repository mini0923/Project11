package string;


public class Quiz2 {

	public static void main(String[] args) {
		
		String str = "881120-2068234";

		if (str.charAt(7) == '1' || str.charAt(7) == '3') {
			System.out.println("남자");
		}else if(str.charAt(7) == '2' || str.charAt(7) == '4') {
			System.out.println("여자");
		}
		
	}

}
