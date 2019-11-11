package ch3;

public class OperatorEx11 {

	public static void main(String[] args) {
		long a = 1000000 * 1000000;
		long b = 1000000 * 1000000L;	// long형 리터럴
		
		// a는 int * int 이므로 결과가 int로 연산결과가 범위를 초과했다.
		// b는 itn * long 이므로 결과가 자동형변환 되어 long이므로 표현가능하다.
		System.out.println(a);
		System.out.println(b);
	}

}
