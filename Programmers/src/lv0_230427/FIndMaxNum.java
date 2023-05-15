package lv0_230427;

class FIndMaxNum {
	public int[] solution(int[] array) {

		int[] answer = new int[2];
		int temp = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > temp) {
				temp = array[i];
				answer[0] = array[i];
				answer[1] = i;
			}
		}

		return answer;
	}
}