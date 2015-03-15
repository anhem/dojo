# Chess

Chess consist of a checkered game board of 64 squares (8x8). The board uses 1-8 as coordinates for the x-axis and a-h for the y-axis.
Coordinate a1 is at the bottom left corner of the white player.

In chess there are 6 different pieces:

* 1 king
* 1 queen
* 2 rooks (sometimes called castles)
* 2 bishops
* 2 knights
* 8 pawns

see http://en.wikipedia.org/wiki/Chess for more details on chess pieces and their moves.

Your task is to provide a program that accept as input a record of moves made in a game of chess and determine if the record is valid.

# Algebraic notation (from wikipedia)

Chess records often use the algebraic notation method for describing moves. Following is a brief explanation, See http://en.wikipedia.org/wiki/Algebraic_notation_(chess) for more details.

* K = King
* Q = Queen
* R = Rook
* B = Bishop
* N = kNight
* pawns moves are presented without a letter

## Notation for captures

When a piece makes a capture, an `x` is inserted immediately before the destination square. For example, `Bxe5` (bishop captures the piece on e5). When a pawn makes a capture, the file from which the pawn departed is used to identify the pawn. For example, exd5

### En passant

En passant captures are indicated by specifying the capturing pawn's file of departure, the `x`, the destination square (not the square of the captured pawn).

## Disambiguating moves

When two (or more) identical pieces can move to the same square, the moving piece is uniquely identified by specifying the piece's letter, followed by (in descending order of preference):

1. the file of departure (if they differ); or
2. the rank of departure (if the files are the same but the ranks differ); or
3. both the file and rank (if neither alone is sufficient to identify the piece—which occurs only in rare cases where one or more pawns have promoted, resulting in a player having three or more identical pieces able to reach the same square).

For example, with knights on g1 and d2, either of which might move to f3, the move is specified as Ngf3 or Ndf3, as appropriate. With knights on g5 and g1, the moves are N5f3 or N1f3. As above, an "x" can be inserted to indicate a capture, for example: N5xf3. Another example: two rooks on d3 and h5, either one of which may move to d5. If the rook on d3 moves to d5, it is possible to disambiguate with either Rdd5 or R3d5, but the file takes precedence over the rank, so Rdd5 is correct. (And likewise if the move is a capture, Rdxd5 is correct.)

## Pawn promotion

When a pawn moves to the last rank and promotes, the piece promoted to is indicated at the end of the move notation, for example: e8Q (promoting to queen)

## Castling

Castling is indicated by the special notations `0-0` (for kingside castling) and `0-0-0` (queenside castling).

## Check and checkmate

A move that places the opponent's king in check usually has the symbol `+` appended. Checkmate at the completion of moves can be represented by the symbol `#`

## End of game

The notation 1–0 at the completion of moves indicates that White won, `0–1` indicates that Black won, and `½–½` indicates a draw.

# Record

`1. e4 e5 2. Nf3 Nf6 3. Bc4 d5 4. d3 Be6 5. Qe2 Qe7 6. g3 Nc6 7. 0-0 0-0-0 8. exd5 Bxd5 9. Bxd5 Nxd5 10. Nxe5 Qxe5 11. Qxe5 Nxe5 12. Re1 Re8 13. Rxe5 Rxe5` (http://www.chess-game-strategies.com/chess-notation.html)

## Kasparov versus the World

`1. e4 c5 2. Nf3 d6 3. Bb5+ Bd7 4. Bxd7+ Qxd7 5. c4 Nc6 6. Nc3 Nf6 7. 0-0 g6 8. d4 cxd4 9. Nxd4 Bg7 10. Nde2 Qe6!? 11. Nd5 Qxe4 12. Nc7+ Kd7 13. Nxa8 Qxc4 14. Nb6+ axb6 15. Nc3 Ra8 16. a4 Ne4 17. Nxe4 Qxe4 18. Qb3 f5 19. Bg5 Qb4 20. Qf7 Be5 21. h3 Rxa4 22. Rxa4 Qxa4 23. Qxh7 Bxb2 24. Qxg6 Qe4 25. Qf7 Bd4 26. Qb3 f4 27. Qf7 Be5 28. h4 b5 29. h5 Qc4 30. Qf5+ Qe6 31. Qxe6+ Kxe6 32. g3 fxg3 33. fxg3 b4 34. Bf4 Bd4+ 35. Kh1! b3 36. g4 Kd5 37. g5 e6 38. h6 Ne7 39. Rd1 e5 40. Be3 Kc4 41. Bxd4 exd4 42. Kg2 b2 43. Kf3 Kc3 44. h7 Ng6 45. Ke4 Kc2 46. Rh1 d3 47. Kf5 b1=Q 48. Rxb1 Kxb1 49. Kxg6 d2 50. h8=Q d1=Q 51. Qh7 b5?! 52. Kf6+ Kb2 53. Qh2+ Ka1 54. Qf4 b4? 55. Qxb4 Qf3+ 56. Kg7 d5 57. Qd4+ Kb1 58. g6 Qe4 59. Qg1+ Kb2 60. Qf2+ Kc1 61. Kf6 d4 62. g7 1–0`



