package com.geeks.guru.model;

public class Board {

	boolean isGameEnded;
	Spot[][] spots = new Spot[8][8];

	public void initialize() {
		for (int i = 0; i < spots.length; i++) {
			for (int j = 0; j < spots[0].length; j++) {
				spots[i][j].piece = null;
			}
		}
		for (int i = 0; i < spots.length; i++) {
			spots[1][i].piece = new Soilder(true);
			spots[spots.length - 2][i].piece = new Soilder(false);
		}
		spots[0][0].piece = new Fort(true);
		spots[0][7].piece = new Fort(true);
		spots[spots.length - 1][0].piece = new Fort(false);
		spots[spots.length - 1][7].piece = new Fort(false);

		spots[0][1].piece = new Horse(true);
		spots[0][6].piece = new Horse(true);
		spots[spots.length - 1][1].piece = new Horse(false);
		spots[spots.length - 1][6].piece = new Horse(false);

		spots[0][2].piece = new Bishop(true);
		spots[0][5].piece = new Bishop(true);
		spots[spots.length - 1][2].piece = new Bishop(false);
		spots[spots.length - 1][5].piece = new Bishop(false);

		spots[0][3].piece = new Queen(true);
		spots[0][4].piece = new King(true);
		spots[spots.length - 1][3].piece = new King(false);
		spots[spots.length - 1][4].piece = new Queen(false);

	}

	public boolean movePiece(int fromRow, int fromCol, int toRow, int toCol) {

		if (fromRow < 0 || fromRow > 7 || toRow < 0 || toRow > 7 || fromCol < 0 || fromCol > 7 || toCol < 0
				|| toCol > 7) {
			return false;
		}

		Spot currentSpot = spots[fromRow][fromCol];
		Spot toSpot = spots[toRow][toCol];

		if (currentSpot.piece == null) {
			return false;
		}
		if (toSpot.piece != null && currentSpot.piece.isWhite && toSpot.piece.isWhite
				|| !currentSpot.piece.isWhite && !toSpot.piece.isWhite) {
			return false;
		}

		if (!currentSpot.piece.isValidMove(fromRow, fromCol, toRow, toCol)) {
			return false;
		}
		if(toSpot.piece instanceof King) {
			isGameEnded = true;
		}
		toSpot.piece = currentSpot.piece;
		currentSpot.piece = null;
		return true;
	}

	public boolean isGameEnded() {
		return isGameEnded;
	}

}
