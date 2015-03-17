package se.java.meetup.chess;

public interface Piece {

    boolean isValidStartPosition();

    boolean isValidMove(int x, int y);

    void moveTo(int x, int y);
}
