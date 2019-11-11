package ch3;

public class OperatorEx13 {

	public static void main(String[] args) {
		char c1 = 'a';	// c1에는 문장 'a'의 코드값인 97이 저장된다.
		char c2 = c1;	// c1에 저장되어 있는 값이 c2에 저장된다.
		char c3 = ' ';	// c3를 공백으로 초기화 한다.
		
		int i = c1 + 1;	// 'a'+1 -> 97+1 -> 98
						// 덧셈 연산을 하면서 int형으로 자동형변환
		c3 = (char)(c1+1);	// int형으로 자동형변환 되었지만, char로 명시적 형변환하면서 결과값이 문자로 변환됨
		c2++;			// 형변환없이 코드값만 증가
		c2++;
		
		System.out.println("i=" + i);
		System.out.println("c2=" + c2);
		System.out.println("c3=" + c3);
	}

}
