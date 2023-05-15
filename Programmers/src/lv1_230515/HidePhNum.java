package lv1_230515;

class HidePhNum {
	public String solution(String phone_number) {
		String answer = "";

		int changeNum = phone_number.length() - 4; // 가릴숫자 길이

		for (int i = 0; i < changeNum; i++) {
			answer += "*";
		}

		answer += phone_number.substring(changeNum);

		return answer;
	}
}