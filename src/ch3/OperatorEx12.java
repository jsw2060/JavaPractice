package ch3;

public class OperatorEx12 {

	public static void main(String[] args) {
		int a = 1000000 * 1000000 / 1000000;
		int b = 1000000 / 1000000 * 1000000;
		
		// a는 곱셈 연산 결과가 int 범위를 벗어나기 때문에 결과값이 이상해진다.
		// b는 나눗셈과 곱셈의 결과가 int 범위를 벗어나지 않기 때문에 결과가 올바르게 출력된다.
		System.out.println(a);
		System.out.println(b);
	}

}
