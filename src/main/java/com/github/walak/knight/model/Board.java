package com.github.walak.knight.model;

public class Board {

    private int[][] fields;

    public Board(int size) {
        this.fields = new int[size][];
        for (int i = 0; i < size; i++) {
            this.fields[i] = new int[size];
        }
    }

    public void clearBoard() {
        for (int x = 0; x < fields.length; x++) {
            for (int y = 0; y < fields.length; y++) {
                fields[x][y] = 0;
            }
        }
    }

    public int getSize() {
        return fields.length;
    }

    public int getField(int x, int y) {
        return fields[x][y];
    }

    public boolean isEmpty(int x, int y) {
        return getField(x, y) == 0;
    }

    public void markField(int x, int y, int v) {
        fields[x][y] = v;
    }

    @Override
    public String toString() {
        String output = "";
        for (int y = 0; y < getSize(); y++) {
            output += "[";
            for (int x = 0; x < getSize(); x++) {
                output += fields[x][y];
                output += (x + 1) == getSize() ? "" : ",\t";
            }
            output += "]\r\n";
        }
        return output;
    }


}
