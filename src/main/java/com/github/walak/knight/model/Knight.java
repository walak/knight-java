package com.github.walak.knight.model;

public class Knight extends Coord {

    private int marker;
    private Coord start;

    public Knight(int x, int y, int marker) {
        super(x, y);
        this.marker = marker;
        this.start = new Coord(x, y);
    }

    public Knight move(Direction direction) {
        this.x = this.x + direction.getX();
        this.y = this.y + direction.getY();
        this.marker++;
        return this;
    }

    public int getMarker() {
        return marker;
    }

    public Coord getStart() {
        return start;
    }
}
