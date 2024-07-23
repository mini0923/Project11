package object;

public class Quiz2 {

	public static void main(String[] args) {

		// Object는 모든 클래스의 부모이기때문에 형변환 가능
		// 하지만 Object 타입 변수로는 학생의 정보를 사용할 수 없다.
		Object obj = new Student(101, "둘리");
		
		// 다운 캐스팅 진행
		if(obj instanceof Student) { // 타입 확인
			Student student = (Student) obj;  // 원래 타입으로 진행
				System.out.println(student.id);
				System.out.println(student.name);
			}
		}
		
	
	}

