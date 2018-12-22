package com.geeks.guru;

import com.geeks.guru.model.Board;
import com.geeks.guru.model.Player;

public class ChessGame {

	Board board;
	Player white;
	Player black;

	public ChessGame() {
		board = new Board();
		white = new Player(board);
		black = new Player(board);
	}

	public void start() {
		board.initialize();
		while (!board.isGameEnded()) {
			white.play();
			black.play();
		}
	}

}
