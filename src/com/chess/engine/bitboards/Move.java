package com.chess.engine.bitboards;

import com.chess.engine.bitboards.BitBoard.Piece;


//Clase principal de los movimientos
public class Move {
	//Declaramos las variables locacion actual, locacion de destino y la pieza movida
	final int currentLocation;
	final int destinationLocation;
	final Piece movedPiece;

	//definimos move con los 3 parametros antes mencionados
	public Move(final int currentLocation,
                final int destinationLocation,
                final Piece moved) {
		this.currentLocation = currentLocation;
		this.destinationLocation = destinationLocation;
		this.movedPiece = moved;
	}

	@Override
	public String toString() {
		return BitBoard.getPositionAtCoordinate(this.currentLocation) + "-"
		        + BitBoard.getPositionAtCoordinate(this.destinationLocation);
	}

	@Override
	public int hashCode() {
		return this.movedPiece.hashCode() +
			   this.currentLocation +
               this.destinationLocation;
	}

	@Override
	public boolean equals(final Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Move)) {
			return false;
		}
		final Move otherMove = (Move) other;
		return (this.movedPiece == otherMove.getMovedPiece())
		        && (this.currentLocation == otherMove.getCurrentLocation())
		        && (this.destinationLocation == otherMove.getDestinationLocation());
	}

	public int getDestinationLocation() {
		return this.destinationLocation;
	}

	public int getCurrentLocation() {
		return this.currentLocation;
	}

	public Piece getMovedPiece() {
		return this.movedPiece;
	}

}
