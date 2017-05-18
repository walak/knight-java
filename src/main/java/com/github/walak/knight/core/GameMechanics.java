package com.github.walak.knight.core;

import com.github.walak.knight.model.Board;
import com.github.walak.knight.model.Direction;
import com.github.walak.knight.model.Knight;
import com.github.walak.knight.model.Move;

public class GameMechanics {

    private final Knight knight;
    private final Board board;

    public GameMechanics(Knight knight, Board board) {
        this.knight = knight;
        this.board = board;
    }

    public boolean canMove(Direction direction) {
        int x = knight.getX() + direction.getX();
        int y = knight.getY() + direction.getY();
        return !(isCoordOutOfBoard(x, y) || isFieldMarked(x, y));
    }

    private boolean isCoordOutOfBoard(int x, int y) {
        return isOutOfBoard(x) || isOutOfBoard(y);
    }

    private boolean isOutOfBoard(int v) {
        return v < 0 || v > board.getSize();
    }

    private boolean isFieldMarked(int x, int y) {
        return board.getField(x, y) != 0;
    }

    public Move move(Direction direction) {
        Move toReturn = new Move(knight, direction);
        knight.move(direction);
        board.markField(knight.getX(), //it is mutable anyway, so we can just use new positon
                knight.getY(),
                knight.getMarker());
        return toReturn;
    }
}
