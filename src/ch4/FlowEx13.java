package ch4;

public class FlowEx13 {

	public static void main(String[] args) {
		int sum = 0;	// 합계를 저장하기 위한 변수.
		
		for(int i=1; i<=10; i++) {
			sum += i;	// sum = sum + i;
		}
		// System.out.println(i-1 + " 까지의 합: " + sum); 에러 발생
		// 변수 i의 유효범위는 for문의 범위까지 이다. 이 범위를 벗어나서 i를 사용했으므로 에러
	}

}
