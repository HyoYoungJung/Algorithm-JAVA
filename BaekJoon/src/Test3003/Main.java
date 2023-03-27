package Test3003;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		int king = 1;
		int queen = 1;
		int look = 2;
		int bishop = 2;
		int knight = 2;
		int pawn = 8;

		int fKing = s.nextInt();
		int fQueen = s.nextInt();
		int fLook = s.nextInt();
		int fBishop = s.nextInt();
		int fKnight = s.nextInt();
		int fPawn = s.nextInt();

		System.out.print(king - fKing + " ");
		System.out.print(queen - fQueen + " ");
		System.out.print(look - fLook + " ");
		System.out.print(bishop - fBishop + " ");
		System.out.print(knight - fKnight + " ");
		System.out.print(pawn - fPawn);

	}

}
