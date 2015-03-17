package se.java.meetup.chess;

import static se.java.meetup.chess.Color.WHITE;

public class Pawn implements Piece {

    public int x;
    public int y;
    private Color color;

    public Pawn(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
        if (!isValidStartPosition()) {
            throw new IllegalArgumentException("The pawn is not in a valid start position!");
        }
    }

    @Override
    public boolean isValidStartPosition() {
        if (color == WHITE) {
            if (y == 1 && x >= 0 && x < 8) {
                return true;
            } else {
                return false;
            }
        } else {
            if (y == 6 && x >= 0 && x < 8) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public boolean isValidMove(int newX, int newY) {
        if (color == WHITE) {
            if (newX == x && (newY - y == 2 || newY - y == 1)) {
                return true;
            }
            return false;
        } else {
            if (newX == x && (y - newY == 2 || y - newY == 1)) {
                return true;
            } else {
                return false;
            }
        }
    }

    @Override
    public void moveTo(int x, int y) {
        if (isValidMove(x, y)) {
            this.x = x;
            this.y = y;
        } else{
            throw new IllegalArgumentException("Invalid move!");
        }
    }
}
