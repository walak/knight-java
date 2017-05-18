package com.github.walak.knight.core;

import com.github.walak.knight.model.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;

public class GameMechanics {

    private final static Random RANDOM = new Random();
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

    private Coord getRandomLocation(int max) {
        int x = RANDOM.nextInt(max);
        int y = RANDOM.nextInt(max);
        return new Coord(x, y);
    }

    private List<Direction> getPossibleMoves() {
        return Direction.DIRECTIONS.stream()
                .filter(d -> canMove(d))
                .collect(Collectors.toList());
    }

    private Optional<Direction> getNextRandomPossibleMove() {
        List<Direction> directions = getPossibleMoves();
        Collections.shuffle(directions);
        if (directions.isEmpty()) {
            return Optional.empty();
        } else
            return Optional.of(directions.get(0));
    }

}
