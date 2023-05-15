package lv1_230504;

class NumIntoArr {
	public int[] solution(long n) {

		// n의 자릿수 파악
		int cnt = 0; // 자릿수 저장
		long temp = n; // 몫 저장

		while (temp > 0) {
			temp /= 10;
			cnt++;
		}

		// n의 자릿수 만큼의 길이를 가진 배열 생성
		int[] answer = new int[cnt];

		temp = n;
		long remainder = 0;

		// n의 뒷자리 부터 배열에 넣기
		for (int i = 0; i < answer.length; i++) {
			remainder = temp % 10;
			temp /= 10;
			answer[i] = (int) remainder;
		}
		return answer;
	}
}