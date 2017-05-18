package com.github.walak.knight.model;

public class Knight extends Coord {

    private int marker;
    private Coord start;

    public Knight(int x, int y, int marker) {
        super(x, y);
        this.marker = marker;
        this.start = new Coord(x, y);
    }


}
