package com.github.walak.knight.model;

import java.util.Arrays;
import java.util.List;

public class Direction extends Coord {

    private final String label;

    private Direction(int x, int y, String label) {
        super(x, y);
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public static final List<Direction> DIRECTIONS = Arrays.asList(
            new Direction[]{
                    new Direction(2, -1, "1"),
                    new Direction(1, -2, "2"),
                    new Direction(-1, -2, "3"),
                    new Direction(-2, -1, "4"),
                    new Direction(-2, 1, "5"),
                    new Direction(-1, 2, "6"),
                    new Direction(1, 2, "7"),
                    new Direction(2, 1, "8")

            });
}
