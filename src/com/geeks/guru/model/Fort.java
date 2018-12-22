package com.geeks.guru.model;

public class Fort extends Piece{

	public Fort(boolean isWhite) {
		super(isWhite);
	}

	@Override
	public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol) {
		// TODO Auto-generated method stub
		return false;
	}

}
