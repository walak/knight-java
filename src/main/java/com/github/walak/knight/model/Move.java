package com.github.walak.knight.model;

public class Move {

    private final Coord oldPosition;
    private final Coord newPosition;
    private final Direction direction;

    public Move(Knight knight, Direction direction) {
        this.oldPosition = new Coord(knight);
        this.newPosition = new Coord(knight.getX() + direction.getX(), knight.getY() + direction.getY());
        this.direction = direction;
    }

    public Coord getOldPosition() {
        return oldPosition;
    }

    public Coord getNewPosition() {
        return newPosition;
    }

    public Direction getDirection() {
        return direction;
    }
}
