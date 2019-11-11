package ch3;

public class OperatorEx10 {

	public static void main(String[] args) {
		int a = 1000000;	// 1,000,000 1백만
		int b = 2000000;	// 2,000,000 2백만
		long c = a * b;		// 2,000,000,000,000
		// 결과값을 long형에 저장하니까 될꺼 같지만, int * int 의 결과는 int이므로 저장공간 초과
		System.out.println(c);
	}

}
