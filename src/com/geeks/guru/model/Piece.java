package com.geeks.guru.model;

public abstract class Piece {
	boolean isWhite;

	public Piece(boolean isWhite) {
		this.isWhite = isWhite;
	}

	public abstract boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol);

}
