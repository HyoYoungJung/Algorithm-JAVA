package test4999;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String jaeHwan = s.nextLine();
		String doctor = s.nextLine();
		
		if(jaeHwan.contains(doctor)) {
			System.out.println("go");
		} else {
			System.out.println("no");
		}
	}
}
