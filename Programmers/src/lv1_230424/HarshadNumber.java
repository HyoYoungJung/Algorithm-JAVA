package lv1_230424;

class HarshadNumber {
	public boolean solution(int x) {
		String[] arr = String.valueOf(x).split("");
		int sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += Integer.parseInt(arr[i]);
		}

		if (x % sum == 0) {
			return true;
		} else {
			return false;
		}
	}
}