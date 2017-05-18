package com.github.walak.knight.model;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class Coord {

    protected int x;
    protected int y;

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

    public String toJson() {
        throw new NotImplementedException();
    }
}
