package se.java.meetup.chess;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static se.java.meetup.chess.Color.WHITE;
import static se.java.meetup.chess.Color.BLACK;

public class PawnTest {

    private Pawn whitePawn;

    @Before
    public void setup() {
        whitePawn = new Pawn(0, 1, WHITE);
    }

    @Test
    public void shouldReturnTrueIfValidStartPosition() {
        assertTrue(new Pawn(0, 1, WHITE).isValidStartPosition());
        assertTrue(new Pawn(7, 6, BLACK).isValidStartPosition());
    }

    @Test
    public void shouldReturnFalseIfNotValidStartPosition() {
        assertFalse(IsValidStartPostion(8, 1, WHITE));
        assertFalse(IsValidStartPostion(12, 12, WHITE));
        assertFalse(IsValidStartPostion(8, 6, BLACK));
        assertFalse(IsValidStartPostion(8, 1, BLACK));
    }

    private boolean IsValidStartPostion(int x, int y, Color color) {
        try {
            new Pawn(x, y, color);
        } catch (IllegalArgumentException e) {
            return false;
        }
        return true;
    }

    @Test
    public void shouldBeValidMove() {
        assertTrue(new Pawn(0, 1, WHITE).isValidMove(0, 2));
        assertTrue(new Pawn(0, 6, BLACK).isValidMove(0, 5));
    }

    @Test
    public void shouldNotBeValidMove() {
        assertFalse(new Pawn(0, 1, WHITE).isValidMove(0, 4));
        assertFalse(new Pawn(0, 6, BLACK).isValidMove(0, 4));
    }

    @Test
    public void ifValidMoveSetPositionShouldBeAllowed() {
        whitePawn.moveTo(0, 2);
        assertEquals(0, whitePawn.x);
        assertEquals(2, whitePawn.y);
    }

    @Test(expected = IllegalArgumentException.class)
    public void ifNotValidMoveSetPositionShouldNotBeAllowed() {
        whitePawn.moveTo(0, 4);
    }
}