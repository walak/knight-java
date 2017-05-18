package com.github.walak.knight.model;

import java.util.List;
import java.util.stream.Collectors;

public class MoveHistory {

    private final List<Direction> moves;
    private final Knight knight;
    private final Board board;

    public MoveHistory(List<Direction> moves, Knight knight, Board board) {

        this.moves = moves;
        this.knight = knight;
        this.board = board;
    }

    @Override
    public String toString() {
        return moves.stream()
                .map(m -> m.getLabel())
                .collect(Collectors.joining());
    }

    public List<Direction> getMoves() {
        return moves;
    }

    public Knight getKnight() {
        return knight;
    }

    public Board getBoard() {
        return board;
    }
}
