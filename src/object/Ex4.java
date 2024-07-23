package object;

public class Ex4 {

	public static void main(String[] args) {

		Book book = new Book(200, "개미");
		
		System.out.println(book.toString());
		System.out.println(book); // book.toString() 과 같다.
		
		Book book2 = book; // 주소 카피
		System.out.println(book.hashCode());
		System.out.println(book2.hashCode()); // 같은 인스턴스를 바라보기 때문에 주소가 같음
		
		
		
	}

}

// 도서 클래스
class Book {
		
		int bookNumber;	// 번호
		String bookTitle; // 제목
		
		// 모든 멤버변수를 초기화하는 생성자
		public Book(int bookNumber, String bookTitle) {
			super();
			this.bookNumber = bookNumber;
			this.bookTitle = bookTitle;
		}

		// 클래스 멤버변수를 사용해서 자동으로 문자열이 생성된다.
		@Override
		public String toString() {
			return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
		}

		
	
		
}