package object;

public class Quiz1 {

	public static void main(String[] args) {

		MyDate date1 = new MyDate(2024, 7, 22);
		MyDate date2 = new MyDate(2024, 7, 22);
		
		if (date1.equals(date2)) {
			System.out.println("date1 과 date2 가 같습니다.");
		}else {
			System.out.println("date1 과 date2 가 틀립니다.");
		}
		
		MyDate date3 = new MyDate(2024	, 7, 21);
		MyDate date4 = new MyDate(2024	, 7, 22);
		
		if (date3.equals(date4)) {
			System.out.println("date3 과 date4 가 같습니다.");
		}else {
			System.out.println("date3 과 date4 가 틀립니다.");
		}
		
	}

}

// 날짜 클래스 
class MyDate {
	
	int year;
	int month;
	int day;
	
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof MyDate) {	// 날짜 객체인지 확인
			MyDate date = (MyDate) obj; // Date로 형변환
			if(this.year == date.year && 
				this.month == date.month && 
				this.day == date.day) {
				return true;
			}
		}
		
		return false;
	}
	
	
	
	
}
