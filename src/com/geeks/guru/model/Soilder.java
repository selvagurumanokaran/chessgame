package com.geeks.guru.model;

public class Soilder extends Piece {

	public Soilder(boolean isWhite) {
		super(isWhite);
	}

	@Override
	public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol) {
		if (this.isWhite) {
			if (fromRow == 1) {
				return (fromRow + 2 <= 7 && fromRow + 2 == toRow && fromCol == toCol)
						|| (fromRow + 1 <= 7 && fromRow + 1 == toRow && fromCol == toCol)
						|| (fromCol + 1 <= 7 && fromRow + 1 <= 7 && fromCol + 1 == toCol && fromRow + 1 == toRow)
						|| (fromCol - 1 >= 0 && fromCol - 1 == toCol && fromCol + 1 == toCol && fromRow + 1 == toRow);
			}
			return (fromRow + 1 == toRow && fromCol == toCol)
					|| (fromCol + 1 <= 7 && fromRow + 1 <= 7 && fromCol + 1 == toCol && fromRow + 1 == toRow)
					|| (fromCol - 1 >= 0 && fromCol - 1 == toCol && fromCol + 1 == toCol && fromRow + 1 == toRow);
		}
		if (!this.isWhite) {
			if (fromRow == 6) {
				return (fromRow - 2 >= 0 && fromRow - 2 == toRow && fromCol == toCol)
						|| (fromRow - 1 >= 0 && fromRow - 1 == toRow && fromCol == toCol)
						|| (fromCol - 1 >= 0 && fromRow - 1 >= 0 && fromCol - 1 == toCol && fromRow - 1 == toRow)
						|| (fromCol + 1 <= 7 && fromCol + 1 == toCol && fromCol - 1 == toCol && fromRow - 1 == toRow);
			}
			return (fromRow - 1 >= 0 && fromRow - 1 == toRow && fromCol == toCol)
					|| (fromCol - 1 >= 0 && fromRow - 1 >= 0 && fromCol - 1 == toCol && fromRow - 1 == toRow)
					|| (fromCol + 1 <= 7 && fromCol + 1 == toCol && fromCol - 1 == toCol && fromRow - 1 == toRow);
		}
		return false;
	}

}
