package wrapper.quiz;

import java.util.ArrayList;

public class Quiz3 {

	public static void main(String[] args) {

		ArrayList<Character> list = new ArrayList<Character>();
		
		list.add('a'); // -> list.add (new Character('a')) 으로 변환된다. (오토박싱)
		list.add('b');
		list.add('c');
		list.add('d');

		
		for (int i = 0 ; i < list.size(); i++) {
			char ch = list.get(i);	// list.get(i).charValue()로 변환		
			System.out.println(ch);
		}
		
		
	}

}
