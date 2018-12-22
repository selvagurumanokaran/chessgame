package com.geeks.guru.model;

import java.util.Scanner;

public class Player {

	Board board;

	public Player(Board board) {
		this.board = board;
	}

	public void play() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("From:");
		System.out.print("Enter row: ");
		int fromRow = scanner.nextInt();

		System.out.print("Enter column: ");
		int fromCol = scanner.nextInt();

		System.out.println("To:");
		System.out.print("Enter row: ");
		int toRow = scanner.nextInt();

		System.out.print("Enter column: ");
		int toCol = scanner.nextInt();

		if (!board.movePiece(fromRow, fromCol, toRow, toCol)) {
			System.out.println("Invalid move! Enter the details again:");
			play();
		}
	}

}
