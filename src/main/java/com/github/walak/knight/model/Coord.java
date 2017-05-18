package com.github.walak.knight.model;

public class Coord {

    private final int x;
    private final int y;

    public Coord(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coord(Coord coord) {
        this(coord.getX(), coord.getY());
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
