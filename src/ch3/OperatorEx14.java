package ch3;

public class OperatorEx14 {

	public static void main(String[] args) {
		char c1 = 'a';
		
		//char c2 = c1+1;
		// 컴파일 에러발생!!
		// 덧셈 연산을 수행하면서 결과값이 int형으로 자동형변환 되었으나, 저장되는 변수의 c2의 데이터형이 char로 맞지 않음.
		char c2 = 'a'+1;
		// 컴파일 에러없음
		
		System.out.println(c2);
	}

}
