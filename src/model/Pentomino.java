package model;

import java.util.ArrayList;
import java.util.List;

public class Pentomino {

    private final char name;
    private final List<boolean[][]> orientations;
    public Pentomino(char name, List<boolean[][]> orientations) {
        this.name = name;
        this.orientations = new ArrayList<>();
    }

    public char getName() {
        return name;
    }

    public List<boolean[][]> getOrientations() {
        return orientations;
    }
}
