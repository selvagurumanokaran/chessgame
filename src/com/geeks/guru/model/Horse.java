package com.geeks.guru.model;

public class Horse extends Piece{

	public Horse(boolean isWhite) {
		super(isWhite);
	}

	@Override
	public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol) {
		// TODO Auto-generated method stub
		return false;
	}

}
